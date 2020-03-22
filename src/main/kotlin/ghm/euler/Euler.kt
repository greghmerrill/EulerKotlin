package ghm.euler

import kotlin.system.exitProcess

fun solve(expect: Any?, solver: () -> Any?) {
    val start = System.currentTimeMillis()
    val solution = solver()
    val end = System.currentTimeMillis()
    println("Finished in ${end - start}ms")

    if (expect == null) {
        println("Got answer: $solution")
        System.err.println("Please provide an \"expect\" value")
        exitProcess(1)
    }

    if (solution != expect) {
        System.err.println("Expected $expect, but got $solution")
        exitProcess(1)
    }

    println("Got expected answer: $solution")
}