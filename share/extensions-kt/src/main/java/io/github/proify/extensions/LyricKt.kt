/*
 * Copyright 2026 Proify
 * Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

package io.github.proify.extensions

import io.github.proify.lyricon.lyric.model.RichLyricLine
import io.github.proify.lyricon.lyric.model.interfaces.ILyricLine
import kotlin.math.abs

fun List<ILyricLine>.toRichLyricLines(): List<RichLyricLine> {
    return map {
        RichLyricLine(
            begin = it.begin,
            end = it.end,
            duration = it.duration,
            text = it.text,
            words = it.words,
            isAlignedRight = it.isAlignedRight,
            metadata = it.metadata
        )
    }
}

/**
 * 在已排序的列表中查找�?targetBegin 最接近且误差在 tolerance 内的 LyricLine
 */
fun <T : ILyricLine> List<T>.findClosest(targetBegin: Long, tolerance: Long): T? {
    if (this.isEmpty()) return null

    // 使用二分查找找到插入�?
    val index = this.binarySearch { it.begin.compareTo(targetBegin) }

    // 如果精确匹配到了 (index >= 0)
    if (index >= 0) return this[index]

    // 如果没匹配到，计算插入点附近的元�?
    val insertionPoint = -(index + 1)

    // 检查插入点位置及其前一个位置，看哪个更接近且在误差�?
    val candidates = mutableListOf<T>()
    if (insertionPoint < size) candidates.add(this[insertionPoint])
    if (insertionPoint > 0) candidates.add(this[insertionPoint - 1])

    return candidates
        .filter { abs(it.begin - targetBegin) <= tolerance }
        .minByOrNull { abs(it.begin - targetBegin) }
}