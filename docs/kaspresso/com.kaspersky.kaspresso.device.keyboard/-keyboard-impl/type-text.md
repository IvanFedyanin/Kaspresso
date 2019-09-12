[kaspresso](../../index.md) / [com.kaspersky.kaspresso.device.keyboard](../index.md) / [KeyboardImpl](index.md) / [typeText](./type-text.md)

# typeText

`fun typeText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Overrides [Keyboard.typeText](../-keyboard/type-text.md)

Types text char by char in the focused text field.
Use it only when Espresso or UiAutomator are not appropriate (e.g. when you are on the lock screen).

Consider to use [ViewActions.typeText](#).
Also, consider to use [UiObject.setText](#).

Required Permissions: INTERNET
