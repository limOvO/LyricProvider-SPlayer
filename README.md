# LyricProvider - SPlayer

> [!CAUTION]
> <div style="font-size:1.5em">**聲明**：本專案所有程式碼完全由 AI 生成，未經人工審核，使用風險自負。</div>

> [!CAUTION]
> <div style="font-size:1.5em">**聲明**：本專案所有程式碼完全由 AI 生成，未經人工審核，使用風險自負。</div>

> [!CAUTION]
> <div style="font-size:1.5em">**聲明**：本專案所有程式碼完全由 AI 生成，未經人工審核，使用風險自負。</div>

---

#### 基于 Xposed 的歌词注入模块，专为 [SPlayer-for-Android](https://github.com/imsyy/SPlayer-for-Android) 适配

![Platform](https://img.shields.io/badge/Platform-Android-brightgreen?style=flat&logo=android)
![Release](https://img.shields.io/github/v/release/limOvO/LyricProvider-SPlayer?style=flat&color=blue&logo=github)
![License](https://img.shields.io/github/license/limOvO/LyricProvider-SPlayer?style=flat)

## 🎯 功能

通过 WebView JavaScript 注入，绕过 SPlayer 的 `showDesktopLyric` 开关保护，将歌词实时推送至 [Lyricon / 词幕](https://github.com/HighCapable/Lyricon)。

- 自动读取 SPlayer 内部 Pinia Store 中的歌词数据
- 支援 LRC + YRC 格式
- 无需开启桌面歌词即可生效
- 约 2 秒同步间隔

## 📥 安装

1. **下载**：前往 [Releases 页面](https://github.com/limOvO/LyricProvider-SPlayer/releases) 获取最新 APK。
2. **激活**：在 **LSPosed** 中勾选 `SPlayerProvider` 模块。
3. **作用域**：勾选 `SPlayer`（`top.imsyy.splayer.android`）。
4. **重启**：强行停止 SPlayer 并重新打开。

## ⚠️ 注意事项

- 仅适用于 SPlayer-for-Android（Capacitor + Vue 3 + Pinia 版本）
- 需要 LSPosed / LSPatch 环境
- 歌词来源为 SPlayer 内部在线歌词，模块不做额外搜索

## 🧩 依赖

- [YukiHookAPI](https://github.com/HighCapable/YukiHookAPI)
- [Lyricon Provider SDK](https://github.com/HighCapable/Lyricon)
- [Kavaref](https://github.com/HighCapable/Kavaref)

## 📄 许可证

基于 [tomakino/LyricProvider](https://github.com/tomakino/LyricProvider)（Apache 2.0）修改。

```
Copyright 2026 Proify
Licensed under the Apache License, Version 2.0
```
