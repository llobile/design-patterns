package shapeFactory

import shape.Circle
import shape.Shape

class CircleFactory {
    fun create(): Shape = Circle()
}