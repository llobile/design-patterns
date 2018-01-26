import shape.*

class ShapeFactory {
    fun getShape(type: ShapeType) : Shape = when(type) {
        ShapeType.CIRCLE -> Circle()
        ShapeType.RECTANGLE -> Rectangle()
        ShapeType.SQUARE -> Square()
    }
}