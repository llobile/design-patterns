/**
 * The observer pattern is a software design pattern in which an object, called the subject,
 * maintains a list of its dependents, called observers, and notifies them automatically of
 * any state changes, usually by calling one of their methods.
 */

// Example

import kotlin.properties.Delegates

class Car {
    var colorListener: CarColorChangedListener? = null

    var color: String by Delegates.observable("") { _, _, new ->
        colorListener?.onCarColorChanged(new)
    }
}

interface CarColorChangedListener {
    fun onCarColorChanged(newColor: String)
}

class PrintingCarColorChangedListener : CarColorChangedListener {
    override fun onCarColorChanged(newColor: String) = println("The cars color has been changed to: $newColor")
}

// Usage

val car = Car()
car.colorListener = PrintingCarColorChangedListener()
car.color = "Blue"
car.color = "Red"