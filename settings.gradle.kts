plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "orderstream"

include("common")
include("order")
include("stock")
include("delivery")
include("return")
