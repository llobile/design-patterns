import shape.Rectangle
import shape.Shape
import shape.Square
import shapeFactory.CircleFactory

fun factoryPattern(args: Array<String>) {
    val circleFactory = CircleFactory()
    fun rectangleFactory() = Rectangle()

    /**
     * Method that takes a factory function and returns a shape.
     * How the factory function is defined is up to the caller.
     */
    fun createShape(factory: () -> Shape): Shape = factory()

    // Concrete factory method uses a factory class to create a shape.
    createShape({ circleFactory.create() }).draw()
    // Factory method is a lambda using a function defined above.
    createShape({ rectangleFactory() }).draw()
    // Factory method is a lambda defined here.
    createShape({ Square() }).draw()
}