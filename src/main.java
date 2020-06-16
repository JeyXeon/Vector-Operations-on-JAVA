import java.util.Arrays;
import java.util.Vector;

public class main {
    public static void main(String[] args){
        System.out.println("---Создание первого вектора---");
        vector vector_1 = new vector(input.coordinate_X(), input.coordinate_Y(), input.coordinate_Z());
        System.out.println("---Длина вектора---\n" + vector_1.size_vector());
        System.out.println("---Создание второго вектора---");
        vector vector_2 = new vector(input.coordinate_X(), input.coordinate_Y(), input.coordinate_Z());
        System.out.println("---Длина вектора---\n " + vector_2.size_vector());
        System.out.println("---Скалярное произведение---\n " + vector_1.scalar_product(vector_2));
        System.out.println("---Векторное произведение---");
        vector_1.cross_product(vector_2);
        System.out.println("---Косинус угла между векторами---\n" + vector_1.cos_angle(vector_2));
        System.out.println("---Сумма векторов---");
        vector_1.sum(vector_2);
        System.out.println("---Разность векторов---");
        vector_1.difference(vector_2);
    }
}

