import java.util.*;

public class FilterNotebook {
    private final Map<String, Object> filterParams = new HashMap<>();
    Scanner scanner;

    public FilterNotebook() {
        this.scanner = new Scanner(System.in);
    }

    public void SetFilterParamsModel() {
        System.out.print("Модель: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            String model = str.toLowerCase();
            filterParams.put("model", model);
        }
    }

    public void SetFilterParamsPrice() {
        System.out.print("Цена: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer price = Integer.parseInt(str);
            filterParams.put("price", price);
        }
    }

    public void SetFilterParamsLaunchYear() {
        System.out.print("Год выпуска: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer launchYear = Integer.parseInt(str);
            filterParams.put("", launchYear);
        }
    }

    public void SetFilterParamsType() {
        System.out.print("Тип: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            String type = str.toLowerCase();
            filterParams.put("type", type);
        }
    }

    public void SetFilterParamsFrqCPU() {
        System.out.print("Частота процессора: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer maxFrqCPU = Integer.parseInt(str);
            filterParams.put("maxFrqCPU", maxFrqCPU);
        }
    }

    public void SetFilterParamsCapacityRAM() {
        System.out.print("Емкость ОЗУ: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer capacityRAM = Integer.parseInt(str);
            filterParams.put("capacityRAM", capacityRAM);
        }
    }


    public void SetFilterParamsCapacityHDD() {
        System.out.print("Емкость ЖД: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer capacityHDD = Integer.parseInt(str);
            filterParams.put("capacityHDD", capacityHDD);
        }
    }


    public void SetFilterParamsOpSys() {
        System.out.print("Операционная система: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            String opSys = str.toLowerCase();
            filterParams.put("opSys", opSys);
        }
    }

    public void SetFilterParamsColor() {
        System.out.print("Цвет корпуса: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            String caseColor = str.toLowerCase();
            filterParams.put("caseColor", caseColor);
        }
    }

    public void SetFilterParamsALL() {
        boolean workFlag = true;
        while (workFlag) {
            System.out.println("1 - Модель");
            System.out.println("2 - Цена");
            System.out.println("3 - Год выпуска");
            System.out.println("4 - Тип");
            System.out.println("5 - Частота процессора");
            System.out.println("6 - Емкость ОЗУ");
            System.out.println("7 - Емкость ЖД");
            System.out.println("8 - Операционная система");
            System.out.println("9 - Цвет корпуса");
            System.out.println("0 - Выход");
            System.out.print("Введите N критерия фильтра: ");


            String str = scanner.nextLine().trim();
            if (!str.equals("")) {
                switch (Integer.parseInt(str)) {
                    case 1 -> {
                        SetFilterParamsModel();
                    }
                    case 2 -> {
                        SetFilterParamsPrice();
                    }
                    case 3 -> {
                        SetFilterParamsLaunchYear();
                    }
                    case 4 -> {
                        SetFilterParamsType();
                    }
                    case 5 -> {
                        SetFilterParamsFrqCPU();
                    }
                    case 6 -> {
                        SetFilterParamsCapacityRAM();
                    }
                    case 7 -> {
                        SetFilterParamsCapacityHDD();
                    }
                    case 8 -> {
                        SetFilterParamsOpSys();
                    }
                    case 9 -> {
                        SetFilterParamsColor();
                    }
                    case 0 -> workFlag = false;
                    default -> System.out.println("Не верно выбран критерий.");
                }
            }
        }

    }

    public void SetFilterParamsTask() {
        boolean workFlag = true;
        while (workFlag) {
            System.out.println("1 - Емкость ОЗУ");
            System.out.println("2 - Емкость ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет корпуса");
            System.out.println("5 - Выход");
            System.out.print("Введите N критерия фильтра: ");


            String str = scanner.nextLine().trim();
            if (!str.equals("")) {
                switch (Integer.parseInt(str)) {
                    case 1 -> {
                        SetFilterParamsCapacityRAM();
                    }
                    case 2 -> {
                        SetFilterParamsCapacityHDD();
                    }
                    case 3 -> {
                        SetFilterParamsOpSys();
                    }
                    case 4 -> {
                        SetFilterParamsColor();
                    }
                    case 0 -> workFlag = false;
                    default -> System.out.println("Не верно выбран критерий.");
                }
            }
        }
    }

    public void ClearFilter() {
        filterParams.clear();
    }

    public List<Notebook> FilterNotebook(Set<Notebook> nbSet) {
        List<Notebook> filteredNotebooks = new ArrayList<>();

        boolean passesFilter;

        for (Notebook note : nbSet) {
            passesFilter = true;

            for (Map.Entry entry : filterParams.entrySet()) {
                switch ((String) entry.getKey()) {
                    case "model":
                        if (!note.getModel().equals(entry.getValue())) {
                            passesFilter = false;
                        }
                        break;
                    case "price":
                        if (note.getPrice() < (int) entry.getValue()) {
                            passesFilter = false;
                        }
                        break;
                    case "launchYear":
                        if (note.getLaunchYear() < (int) entry.getValue()) {
                            passesFilter = false;
                        }
                        break;
                    case "type":
                        if (!note.getType().equals(entry.getValue())) {
                            passesFilter = false;
                        }
                        break;
                    case "maxFrqCPU":
                        if (note.getMaxFrqCPU() < (int) entry.getValue()) {
                            passesFilter = false;
                        }
                    case "capacityRAM":
                        if (note.getCapacityRAM() < (int) entry.getValue()) {
                            passesFilter = false;
                        }
                        break;
                    case "capacityHDD":
                        if (note.getCapacityHDD() < (int) entry.getValue()) {
                            passesFilter = false;
                        }
                        break;
                    case "opSys":
                        if (!note.getOpSys().equals(entry.getValue())) {
                            passesFilter = false;
                        }
                        break;
                    case "caseColor":
                        if (!note.getCaseColor().equals(entry.getValue())) {
                            passesFilter = false;
                        }
                        break;
                }
            }


            if (passesFilter) {
                filteredNotebooks.add(note);
            }
        }
        System.out.println("Найдено: " + filteredNotebooks.size() + " ноутбуков.");
        return filteredNotebooks;
    }
}
