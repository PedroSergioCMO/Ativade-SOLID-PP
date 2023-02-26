public class SL_certo {
    public class Rectangle {
        protected int width;
        protected int height;
        
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
        
        public int getWidth() {
            return width;
        }
        
        public void setWidth(int width) {
            this.width = width;
        }
        
        public int getHeight() {
            return height;
        }
        
        public void setHeight(int height) {
            this.height = height;
        }
        
        public int area() {
            return width * height;
        }
    }
    
    public class Square extends Rectangle {
        public Square(int size) {
            super(size, size);
        }
        
        @Override
        public void setWidth(int width) {
            super.setWidth(width);
            super.setHeight(width);
        }
        
        @Override
        public void setHeight(int height) {
            super.setWidth(height);
            super.setHeight(height);
        }
    }
    
    public class AreaCalculator {
        public int sumAreas(Rectangle[] shapes) {
            int sum = 0;
            for (Rectangle shape : shapes) {
                sum += shape.area();
            }
            return sum;
        }
    }
    
}
