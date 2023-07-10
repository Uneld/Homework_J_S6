import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Notebook nb1 = new Notebook("Acer", 1700,
                2021, "Классический", 4200,
                8, 512, "Windows", "Silver");
        Notebook nb2 = new Notebook("Tecno", 1400,
                2022, "Ультрабук", 3400,
                12, 256, "Linux", "Silver");
        Notebook nb3 = new Notebook("Lenovo", 1900,
                2022, "Классический", 4300,
                16, 512, "Windows", "Gray");
        Notebook nb4 = new Notebook("Macbook", 4200,
                2022, "Ультрабук", 3200,
                8, 256, "MacOS", "Silver");
        Notebook nb5 = new Notebook("ASUS", 5000,
                2023, "Игровой", 4750,
                16, 512, "Windows", "White");
        Notebook nb6 = new Notebook("Dell", 2500,
                2022, "Классический", 3800,
                16, 512, "Windows", "Silver");

        Set<Notebook> nbSet = new HashSet<>();
        nbSet.add(nb1);
        nbSet.add(nb2);
        nbSet.add(nb3);
        nbSet.add(nb4);
        nbSet.add(nb5);
        nbSet.add(nb6);
        System.out.println(nbSet);

        FilterNotebook filter = new FilterNotebook();
        filter.SetFilterParamsTask();
        List<Notebook> filteredNotebooks = filter.FilterNotebook(nbSet);
        System.out.println(filteredNotebooks);

        filter.ClearFilter();
        filter.SetFilterParamsALL();
        filteredNotebooks = filter.FilterNotebook(nbSet);
        System.out.println(filteredNotebooks);
    }
}