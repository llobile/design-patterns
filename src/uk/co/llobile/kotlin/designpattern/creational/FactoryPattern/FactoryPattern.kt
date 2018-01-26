fun factoryPattern(args: Array<String>) {
    val factory = ShapeFactory()
    val circle = factory.getShape(ShapeType.CIRCLE)
    val square = factory.getShape(ShapeType.SQUARE)
    val rectangle = factory.getShape(ShapeType.RECTANGLE)

    circle.draw()
    square.draw()
    rectangle.draw()
}
