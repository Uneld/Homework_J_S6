public class Notebook {
    private String model;
    private int price;
    private int launchYear;
    private String type;
    private int maxFrqCPU;
    private int capacityRAM;
    private int capacityHDD;
    private String opSys;
    private String caseColor;

    public Notebook(String model, int price, int launchYear, String type, int maxFrqCPU, int capacityRAM, int capacityHDD, String opSys, String caseColor) {
        this.model = model;
        this.price = price;
        this.launchYear = launchYear;
        this.type = type;
        this.maxFrqCPU = maxFrqCPU;
        this.capacityRAM = capacityRAM;
        this.capacityHDD = capacityHDD;
        this.opSys = opSys;
        this.caseColor = caseColor;
    }

    @Override
    public int hashCode() {
        return 3 * model.hashCode() + 7 * price
                + 5 * launchYear + 8 * type.hashCode() + 6 * maxFrqCPU + 10 * capacityRAM
                + 8 * capacityHDD + 12 * opSys.hashCode() + 10 * caseColor.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Notebook nb)) return false;

        return this.model.equals(nb.model)
                && this.price == nb.price
                && this.launchYear == nb.launchYear
                && this.type.equals(nb.type)
                && this.maxFrqCPU == nb.maxFrqCPU
                && this.capacityRAM == nb.capacityRAM
                && this.capacityHDD == nb.capacityHDD
                & this.opSys.equals(nb.opSys)
                & this.caseColor.equals(nb.caseColor);
    }

    @Override
    public String toString() {
        return "\nНоутбук: (" + model + "): " +
                "\n Цена: " + price +
                "\n Выход на рынок: " + launchYear +
                "\n Тип: " + type +
                "\n Частота процессора: " + maxFrqCPU +
                "\n Емкость ОЗУ : " + capacityRAM +
                "\n Емкость ЖД: " + capacityHDD +
                "\n Операционная система: " + opSys +
                "\n Цвет корпуса: " + caseColor;
    }

    public String getModel() {
        return model.toLowerCase();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public String getType() {
        return type.toLowerCase();
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxFrqCPU() {
        return maxFrqCPU;
    }

    public void setMaxFrqCPU(int maxFrqCPU) {
        this.maxFrqCPU = maxFrqCPU;
    }

    public int getCapacityRAM() {
        return capacityRAM;
    }

    public void setCapacityRAM(int capacityRAM) {
        this.capacityRAM = capacityRAM;
    }

    public int getCapacityHDD() {
        return capacityHDD;
    }

    public void setCapacityHDD(int capacityHDD) {
        this.capacityHDD = capacityHDD;
    }

    public String getOpSys() {
        return opSys.toLowerCase();
    }

    public void setOpSys(String opSys) {
        this.opSys = opSys;
    }

    public String getCaseColor() {
        return caseColor.toLowerCase();
    }

    public void setCaseColor(String caseColor) {
        this.caseColor = caseColor;
    }
}
