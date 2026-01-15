# KeyCode 检测器

一个简单的 Android 应用，用于检测和显示物理按键的 KeyCode 值。

## 功能特点

- 🎯 实时检测任意物理按键
- 📊 显示按键的 KeyCode 数值
- 🏷️ 显示按键的名称
- 🎨 界面极简，专注功能

## 开发环境

- Android Studio
- Kotlin
- 最低 SDK 版本：21 (Android 5.0)
- 目标 SDK 版本：33+

## 项目结构

```
app/src/main/
├── java/com/example/keycodedetector/
│   └── MainActivity.kt          # 主活动文件
└── res/layout/
    └── activity_main.xml        # 布局文件
```

## 安装步骤

1. **创建新项目**
   - 打开 Android Studio
   - 选择 "New Project" > "Empty Activity"
   - 语言选择 Kotlin
   - 包名：`com.example.keycodedetector`

2. **添加代码文件**
   - 将 `MainActivity.kt` 代码复制到对应文件
   - 将 `activity_main.xml` 代码复制到对应文件

3. **运行应用**
   - 连接 Android 设备或启动模拟器
   - 点击运行按钮（绿色三角形）

## 使用方法

1. 启动应用
2. 按下设备上的任意物理按键
3. 屏幕会实时显示：
   - KeyCode：按键的数字代码
   - Key：按键的名称

## 常见按键 KeyCode 对照表

| 按键 | KeyCode | 说明 |
|------|---------|------|
| 音量加 | 24 | KEYCODE_VOLUME_UP |
| 音量减 | 25 | KEYCODE_VOLUME_DOWN |
| 返回键 | 4 | KEYCODE_BACK |
| Home键 | 3 | KEYCODE_HOME |
| 电源键 | 26 | KEYCODE_POWER |
| 菜单键 | 82 | KEYCODE_MENU |
| 确认键 | 66 | KEYCODE_ENTER |
| 空格键 | 62 | KEYCODE_SPACE |

## 代码说明

### MainActivity.kt

核心方法是 `onKeyDown()`，它会拦截所有按键事件：

```kotlin
override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
    // 显示 KeyCode 数值
    keyCodeText.text = "KeyCode: $keyCode"
    
    // 显示按键名称
    val keyName = KeyEvent.keyCodeToString(keyCode)
    keyNameText.text = "Key: $keyName"
    
    return true
}
```

### activity_main.xml

使用 LinearLayout 垂直布局，包含三个 TextView：
- 提示文本
- KeyCode 显示区域
- Key 名称显示区域

## 常见问题

### Q: 为什么某些按键检测不到？

A: 部分系统级按键（如电源键、Home键）可能被系统拦截，无法传递到应用层。

### Q: 如何检测键盘按键？

A: 连接外接键盘后，应用可以检测所有键盘按键的 KeyCode。

### Q: 应用闪退怎么办？

A: 请检查：
- 包名是否正确
- XML 布局文件中的 ID 是否与代码中一致
- 是否正确继承了 Activity 类

## 许可证

MIT License

## 作者

hoopec

## 更新日志

### v1.0.0 (2025-01-15)
- 初始版本发布
- 支持基本的 KeyCode 检测功能
- 简洁的用户界面