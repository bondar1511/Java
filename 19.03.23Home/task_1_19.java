import java.util.ArrayList;
import java.util.List;
import java.util.Map;
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

public class task1_19 {
 /**
 * @param args
 */
public static void main(String[] args) {
    
    
    public NoteBook(String manufacturer, String model, String displaySize, String displayResolution, int ramSize, int hddSize, String os, String color, double price) {
    this.manufacturer = manufacturer;
    this.model = model;
    this.displaySize = displaySize;
    this.displayResolution = displayResolution;
    this.ramSize = ramSize;
    this.hddSize = hddSize;
    this.os = os;
    this.color = color;
    this.price = price;
    }
    public String getManufacturer() {
    return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    }
    public String getModel() {
    return model;
    }
    public void setModel(String model) {
    this.model = model;
    }
    public String getDisplaySize() {
    return displaySize;
    }
    public void setDisplaySize(String displaySize) {
    this.displaySize = displaySize;
    }
    public String getDisplayResolution() {
    return displayResolution;
    }
    public void setDisplayResolution(String displayResolution) {
    this.displayResolution = displayResolution;
    }
    public int getRamSize() {
    return ramSize;
    }
    public void setRamSize(int ramSize) {
    this.ramSize = ramSize;
    }
    public int getHddSize() {
    return hddSize;
    }
    public void setHddSize(int hddSize) {
    this.hddSize = hddSize;
    }
    public String getOs() {
    return os;
    }
    public void setOs(String os) {
    this.os = os;
    }
    public String getColor() {
    return color;
    }
    public void setColor(String color) {
    this.color = color;
    }
   public double getPrice() {
    return price;
    }
   public void setPrice(double price) {
    this.price = price;
    }
    }
          
    public class NotebookFilt {
    public static List filter(List notebooks, Map filters) {
    List filteredNotebooks = new ArrayList();
    for (NoteBook notebook : notebooks) {
    boolean allFiltersMatch = true;
    for (String filterKey : filters.keySet()) {
    Object filterValue = filters.get(filterKey);
    switch (filterKey) {
    case "manufacturer":
    if (!notebook.getManufacturer().equals(filterValue)) {
    allFiltersMatch = false;
    }
    break;
    case "model":
    if (!notebook.getModel().equals(filterValue)) {
    allFiltersMatch = false;
    }
    break;
    case "displaySize":
    if (!notebook.getDisplaySize().equals(filterValue)) {
    allFiltersMatch = false;
    }
    break;
    case "displayResolution":
    if (!notebook.getDisplayResolution().equals(filterValue)) {
    allFiltersMatch = false;
    }
    break;
    case "ramSize":
    if (notebook.getRamSize() != (int) filterValue) {
    allFiltersMatch = false;
    }
    break;
    case "hddSize":
    if (notebook.getHddSize() != (int) filterValue) {
    allFiltersMatch = false;
    }
    break;
    case "os":
    if (!notebook.getOs().equals(filterValue)) {
    allFiltersMatch = false;
    }
    break;
    case "color":
    if (!notebook.getColor().equals(filterValue)) {
    allFiltersMatch = false;
    }
    break;
    case "price":
    if (notebook.getPrice() != (double) filterValue) {
    allFiltersMatch = false;
    }
    break;
    }
    if (!allFiltersMatch) {
    break;
    }
    }
    if (allFiltersMatch) {
    filteredNotebooks.add(notebook);
    }
    }
    return filteredNotebooks;
    }
    
    public class  notebooks() {
               
    List notebooks = new ArrayList();
    notebooks.add(new NoteBook("Lenovo", " Carbon", "19 дюймов", "1920x1080", 8, 612, "Windows 8", "Белый", 250000));
    notebooks.add(new NoteBook("Asus", "Apple", "15 дюймов", "1920x1080", 16, 512, "Windows 11", "Черный", 45000));
    notebooks.add(new NoteBook("Apple", "MacBook ", "17 дюймов", "2880x1800", 16, 125, "macOS", "techno", 360000));
    HashMap<String> filters = new HashMap<>();
        System.out.println("Выберите критерий фильтра:");
    System.out.println("1 - Производитель");
    System.out.println("2 - Операционная система");
    System.out.println("3 - Объем жесткого диска");
    System.out.println("4 -  Цвет");
    System.out.println("5 - Объем оперативной памяти");
    System.out.println("6 - Размер дисплея");
    System.out.println("7 - Модель ");
    System.out.println("8 -Разрешение дисплея");
    System.out.println("9 - Цена");

    Scanner scanner = new Scanner(System.in);
    int filterNumber = scanner.nextInt();
    String filterKey = " ";
    switch (filterNumber) {
       case 1:
    filterKey = "manufacturer";
    System.out.println("Введите производителя: ");
    String manufacturer = scanner.next();
    filters.put(filterKey, manufacturer);
    break;
      case 2:
    filterKey = "model";
    System.out.println("Введите модель: ");
    String model = scanner.next();
    filters.put(filterKey, model);
    break;
      case 3:
    filterKey = "displaySize";
    System.out.println("Введите размер дисплея: ");
    String displaySize = scanner.next();
    filters.put(filterKey, displaySize);
    break;
    case 4:
    filterKey = "displayResolution";
    System.out.println("Введите разрешение дисплея: ");
    String displayResolution = scanner.next();
    filters.put(filterKey, displayResolution);
    break;
     case 5:
    filterKey = "ramSize";
    System.out.println("Введите объем оперативной памяти: ");
    int ramSize = scanner.nextInt();
    filters.put(filterKey, ramSize);
    break;
    case 6:
    filterKey = "hddSize";
    System.out.println("Введите объем жесткого диска: ");
    int hddSize = scanner.nextInt();
    filters.put(filterKey, hddSize);
    break;
    case 7:
    filterKey = "os";
    System.out.println("Введите операционную систему: ");
    String os = scanner.next();
    filters.put(filterKey, os);
    break;
    case 8:
    filterKey = "color";
    System.out.println("Введите цвет: ");
    String color = scanner.next();
    filters.put(filterKey, color);
    break;
    case 9:
    filterKey = "price";
    System.out.println("Введите цену: ");
    double price = scanner.nextDouble();
    filters.put(filterKey, price);
    break;
    }
    
    List filteredNotebooks = NotebookFilter.filter(notebooks, filters);
    if (filteredNotebooks.size() == 0) {
    System.out.println("Нет ноутбуков, удовлетворяющих критерию фильтрации");
    } else {
    for (NoteBook notebook : filteredNotebooks) {
    System.out.println(notebook.getManufacturer() + " " + notebook.getModel() + " " + notebook.getDisplaySize() + " " + notebook.getDisplayResolution() + " " +
    notebook.getRamSize() + " " + notebook.getHddSize() + " " + notebook.getOs() + " " + notebook.getColor() + " " +
    notebook.getPrice());
    }
    }
    
}
}
}


