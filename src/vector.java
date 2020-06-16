import java.util.Arrays;

public class vector {
    private final double x;
    private final double y;
    private final double z;
    public vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("---Координаты вектора---\n" + x + " " + y + " " + z);
    }

    public double size_vector(){
        double sqr_X = Math.pow(x, 2);
        double sqr_Y = Math.pow(y, 2);
        double sqr_Z = Math.pow(z, 2);
        return Math.sqrt(sqr_X + sqr_Y + sqr_Z);
    }

    public double scalar_product(vector vector_2) {
        return x * vector_2.x + y * vector_2.y + z * vector_2.z;
    }

    public vector cross_product(vector vector_2){
        return new vector(
                y * vector_2.z - vector_2.y * z,
                x * vector_2.z - vector_2.z * x,
                x * vector_2.y - vector_2.x * y);
    }

    public double cos_angle(vector vector_2){
        return this.scalar_product(vector_2) / (this.size_vector() * vector_2.size_vector());
    }

    public vector sum(vector vector_2){
        return new vector(
                x + vector_2.x,
                y + vector_2.y,
                z + vector_2.z);
    }
    public vector difference(vector vector_2){
        return new vector(
                x - vector_2.x,
                y - vector_2.y,
                z - vector_2.z);
    }
}
