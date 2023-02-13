
    public class Circle {
        private double radius;
        private static final double PI = Math.PI;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return PI * radius * radius;
        }

        public double getCircumference() {
            return PI * 2 * radius;
        }
    }


