[kaspresso](../../index.md) / [com.kaspersky.kaspresso.kviews](../index.md) / [KSwitch](./index.md)

# KSwitch

`class KSwitch : KBaseView<`[`KSwitch`](./index.md)`>, CheckableActions, CheckableAssertions`

View with [CheckableActions](#) and [CheckableAssertions](#).

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KSwitch(function: ViewBuilder.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KSwitch(parent: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>, function: ViewBuilder.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>`KSwitch(parent: DataInteractionDelegate, function: ViewBuilder.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Extension Functions

| Name | Summary |
|---|---|
| [attempt](../../com.kaspersky.kaspresso.extensions.kakaoext/attempt.md) | `fun <T : KBaseView<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>, R> `[`T`](../../com.kaspersky.kaspresso.extensions.kakaoext/attempt.md#T)`.attempt(timeoutMs: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = Configurator.attemptsTimeoutMs, intervalMs: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = Configurator.attemptsIntervalMs, logger: `[`UiTestLogger`](../../com.kaspersky.kaspresso.logger/-ui-test-logger/index.md)` = Configurator.logger, allowedExceptions: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`Class`](https://developer.android.com/reference/java/lang/Class.html)`<out `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>> = Configurator.allowedExceptionsForAttempt, action: `[`T`](../../com.kaspersky.kaspresso.extensions.kakaoext/attempt.md#T)`.() -> `[`R`](../../com.kaspersky.kaspresso.extensions.kakaoext/attempt.md#R)`): `[`R`](../../com.kaspersky.kaspresso.extensions.kakaoext/attempt.md#R)<br>Provides an [com.kaspersky.kaspresso.flakysafety.attempt](../../com.kaspersky.kaspresso.flakysafety/attempt.md) method as an extension of [KBaseView](#).`fun <T : KBaseView<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>, R> `[`T`](../../com.kaspersky.kaspresso.extensions.kakaoext/attempt.md#T)`.attempt(timeoutSec: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, action: `[`T`](../../com.kaspersky.kaspresso.extensions.kakaoext/attempt.md#T)`.() -> `[`R`](../../com.kaspersky.kaspresso.extensions.kakaoext/attempt.md#R)`): `[`R`](../../com.kaspersky.kaspresso.extensions.kakaoext/attempt.md#R)<br>Provides a simplified [com.kaspersky.kaspresso.flakysafety.attempt](../../com.kaspersky.kaspresso.flakysafety/attempt.md) method as an extension of [KBaseView](#). |
| [compositeCheck](../../com.kaspersky.kaspresso.extensions.kakaoext/composite-check.md) | `fun <T : BaseAssertions> `[`T`](../../com.kaspersky.kaspresso.extensions.kakaoext/composite-check.md#T)`.compositeCheck(vararg asserts: `[`T`](../../com.kaspersky.kaspresso.extensions.kakaoext/composite-check.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>A multiple assertion. If at least one of assertions passes, [compositeCheck](../../com.kaspersky.kaspresso.extensions.kakaoext/composite-check.md) is passed. If no one of assertions passes, [compositeCheck](../../com.kaspersky.kaspresso.extensions.kakaoext/composite-check.md) is failed. |
| [safeCompositeCheck](../../com.kaspersky.kaspresso.extensions.kakaoext/safe-composite-check.md) | `fun <T : BaseAssertions> `[`T`](../../com.kaspersky.kaspresso.extensions.kakaoext/safe-composite-check.md#T)`.safeCompositeCheck(vararg asserts: `[`T`](../../com.kaspersky.kaspresso.extensions.kakaoext/safe-composite-check.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>A safe multiple assertion. If at least one of assertions passes, [safeCompositeCheck](../../com.kaspersky.kaspresso.extensions.kakaoext/safe-composite-check.md) is passed and true is returned. If no one of assertions passes, [safeCompositeCheck](../../com.kaspersky.kaspresso.extensions.kakaoext/safe-composite-check.md) is failed and false is returned. |
| [wait](../../com.kaspersky.kaspresso.extensions.kakaoext/wait.md) | `fun <T : KBaseView<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>, R> `[`T`](../../com.kaspersky.kaspresso.extensions.kakaoext/wait.md#T)`.wait(timeoutMs: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = Configurator.attemptsTimeoutMs, logger: `[`UiTestLogger`](../../com.kaspersky.kaspresso.logger/-ui-test-logger/index.md)` = Configurator.logger, action: `[`T`](../../com.kaspersky.kaspresso.extensions.kakaoext/wait.md#T)`.() -> `[`R`](../../com.kaspersky.kaspresso.extensions.kakaoext/wait.md#R)`): `[`R`](../../com.kaspersky.kaspresso.extensions.kakaoext/wait.md#R)<br>Provides a [com.kaspersky.kaspresso.flakysafety.wait](../../com.kaspersky.kaspresso.flakysafety/wait.md) method as an extension of [KBaseView](#).`fun <T : KBaseView<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>, R> `[`T`](../../com.kaspersky.kaspresso.extensions.kakaoext/wait.md#T)`.wait(timeoutSec: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, action: `[`T`](../../com.kaspersky.kaspresso.extensions.kakaoext/wait.md#T)`.() -> `[`R`](../../com.kaspersky.kaspresso.extensions.kakaoext/wait.md#R)`): `[`R`](../../com.kaspersky.kaspresso.extensions.kakaoext/wait.md#R)<br>Provides a simplified [com.kaspersky.kaspresso.flakysafety.wait](../../com.kaspersky.kaspresso.flakysafety/wait.md) method as an extension of [KBaseView](#). |