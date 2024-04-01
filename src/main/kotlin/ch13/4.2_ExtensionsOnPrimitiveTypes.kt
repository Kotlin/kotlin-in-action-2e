package ch13.ex2_ExtensionsOnPrimitiveTypes

import kotlin.time.Duration
import kotlin.time.DurationUnit
import kotlin.time.toDuration

val Int.days: Duration
    get() = this.toDuration(DurationUnit.DAYS)

val Int.hours: Duration
    get() = this.toDuration(DurationUnit.HOURS)
