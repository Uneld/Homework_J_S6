import java.util.*;

public class FilterNotebook {
    private final Map<String, Object> filterParams = new HashMap<>();
    Scanner scanner;

    public FilterNotebook() {
        this.scanner = new Scanner(System.in);;
    }

    public void SetFilterParamsModel() {
        System.out.println("Введите критерии фильтра:");
        System.out.print("Модель: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            String model = str.toLowerCase();
            filterParams.put("model", model);
        }
    }

    public void SetFilterParamsPrice() {
        System.out.println("Введите критерии фильтра:");

        System.out.print("Цена: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer price = Integer.parseInt(str);
            filterParams.put("price", price);
        }
    }

    public void SetFilterParamsLaunchYear() {
        System.out.println("Введите критерии фильтра:");

        System.out.print("Год выпуска: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer launchYear = Integer.parseInt(str);
            filterParams.put("", launchYear);
        }
    }

    public void SetFilterParamsType() {
        System.out.println("Введите критерии фильтра:");

        System.out.print("Тип: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            String type = str.toLowerCase();
            filterParams.put("type", type);
        }
    }

    public void SetFilterParamsFrqCPU() {
        System.out.println("Введите критерии фильтра:");

        System.out.print("Частота процессора: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer maxFrqCPU = Integer.parseInt(str);
            filterParams.put("maxFrqCPU", maxFrqCPU);
        }
    }

    public void SetFilterParamsCapacityRAM() {
        System.out.println("Введите критерии фильтра:");

        System.out.print("Емкость ОЗУ: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer capacityRAM = Integer.parseInt(str);
            filterParams.put("capacityRAM", capacityRAM);
        }
    }


    public void SetFilterParamsCapacityHDD() {
        System.out.println("Введите критерии фильтра:");

        System.out.print("Емкость ЖД: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer capacityHDD = Integer.parseInt(str);
            filterParams.put("capacityHDD", capacityHDD);
        }
    }


    public void SetFilterParamsOpSys() {
        System.out.println("Введите критерии фильтра:");

        System.out.print("Операционная система: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            String opSys = str.toLowerCase();
            filterParams.put("opSys", opSys);
        }
    }

    public void SetFilterParamsColor() {
        System.out.println("Введите критерии фильтра:");

        System.out.print("Цвет корпуса: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            String caseColor = str.toLowerCase();
            filterParams.put("caseColor", caseColor);
        }
    }

    public void SetFilterParamsALL() {
        System.out.println("Введите критерии фильтра:");

        System.out.print("Модель: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            String model = str.toLowerCase();
            filterParams.put("model", model);
        }

        System.out.print("Цена: ");
        str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer price = Integer.parseInt(str);
            filterParams.put("price", price);
        }

        System.out.print("Год выпуска: ");
        str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer launchYear = Integer.parseInt(str);
            filterParams.put("", launchYear);
        }

        System.out.print("Тип: ");
        str = scanner.nextLine().trim();
        if (!str.equals("")) {
            String type = str.toLowerCase();
            filterParams.put("type", type);
        }

        System.out.print("Частота процессора: ");
        str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer maxFrqCPU = Integer.parseInt(str);
            filterParams.put("maxFrqCPU", maxFrqCPU);
        }

        System.out.print("Емкость ОЗУ: ");
        str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer capacityRAM = Integer.parseInt(str);
            filterParams.put("capacityRAM", capacityRAM);
        }

        System.out.print("Емкость ЖД: ");
        str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer capacityHDD = Integer.parseInt(str);
            filterParams.put("capacityHDD", capacityHDD);
        }

        System.out.print("Операционная система: ");
        str = scanner.nextLine().trim();
        if (!str.equals("")) {
            String opSys = str.toLowerCase();
            filterParams.put("opSys", opSys);
        }

        System.out.print("Цвет корпуса: ");
        str = scanner.nextLine().trim();
        if (!str.equals("")) {
            String caseColor = str.toLowerCase();
            filterParams.put("caseColor", caseColor);
        }
    }

    public void SetFilterParamsTask() {
        System.out.println("Введите критерии фильтра:");

        System.out.print("Емкость ОЗУ: ");
        String str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer capacityRAM = Integer.parseInt(str);
            filterParams.put("capacityRAM", capacityRAM);
        }

        System.out.print("Емкость ЖД: ");
        str = scanner.nextLine().trim();
        if (!str.equals("")) {
            Integer capacityHDD = Integer.parseInt(str);
            filterParams.put("capacityHDD", capacityHDD);
        }

        System.out.print("Операционная система: ");
        str = scanner.nextLine().trim();
        if (!str.equals("")) {
            String opSys = str.toLowerCase();
            filterParams.put("opSys", opSys);
        }

        System.out.print("Цвет корпуса: ");
        str = scanner.nextLine().trim();
        if (!str.equals("")) {
            String caseColor = str.toLowerCase();
            filterParams.put("caseColor", caseColor);
        }
    }

    public void ClearFilter(){
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
                        if (note.getLaunchYear() < (int) entry.getValue()){
                        passesFilter = false;
                    }
                    break;
                    case "type":
                        if (!note.getType().equals(entry.getValue())) {
                            passesFilter = false;
                        }
                        break;
                    case "maxFrqCPU":
                        if (note.getMaxFrqCPU() < (int) entry.getValue()){
                        passesFilter = false;
                    }
                    case "capacityRAM":
                        if (note.getCapacityRAM() < (int) entry.getValue()){
                        passesFilter = false;
                    }
                    break;
                    case "capacityHDD":
                        if (note.getCapacityHDD() < (int) entry.getValue()){
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
