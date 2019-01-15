package GenericTriple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Triple<T extends  Number & Comparable<T>>{
    private List<T> numbers;

    public Triple(T a, T b, T c) {
        numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
    }

    public double  max() {
        return numbers.stream().mapToDouble(Number::doubleValue).max().orElse(0);
    }

    public double avarage() {
        return numbers.stream().mapToDouble(Number::doubleValue).sum()/numbers.size();
    }

    public void sort() {
        numbers = numbers.stream().sorted().collect(Collectors.toList());
    }

    public String toString() {
        return numbers.stream()
                            .map(number -> String.format("%.2f", number.doubleValue()))
                            .collect(Collectors.joining(" "));
    }
}
