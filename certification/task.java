import java.util.*;
// Напишите класс-конструктор у которого принимает минимум 3 строки, содержащие три поля id игрушки, текстовое название и частоту выпадения игрушки
// Из принятой строки id и частоты выпадения(веса) заполнить минимум три массива.
// Добавить элементы в коллекцию
// Организовать общую очередь добавления игрушек
// Вызвать метод 10 раз и записать результат в файл и\или вывести на экран.

public class task {

private int id;
private String name;
private int weight;

public Toy(int id, String name, int weight) {
this.id = id;
this.name = name;
this.weight = weight;
}
public int getId() {
return id;
}
public String getName() {
return name;
}
public int getWeight() {
return weight;
}
public static void main(String[] args) {
 
String input_1 = "1, winx doll , 2";
String input_2 = "2, Lego, 1";
String input_3 = "3,car robocar , 4";

PriorityQueue queue = new PriorityQueue(Comparator.comparingInt(Toy::getWeight));
List toys = new ArrayList();

toys.add(parseInput(input_1));
toys.add(parseInput(input_2));
toys.add(parseInput(input_3));

for (Toy toy : toys) {
queue.offer(toy);
}
for (int i = 0; i < 10; i++) {
Toy current = queue.poll();
System.out.println(current.getName());
}
}
private static Toy parseInput(String input) {
String[] parts = input.split(", ");
int id = Integer.parseInt(parts[0]);
String name = parts[1];
int weight = Integer.parseInt(parts[2]);
return new Toy(id, name, weight);
}
private static void writeToOutputFile(String output) {
try (BufferedWriter writer = new BufferedWriter(new FileWriter("vscode\\certification\\file.txt", true))) {
writer.write(output);
writer.newLine();
} catch (IOException e) {
e.printStackTrace();
}
}
for (int i = 0; i < 10; i++) {
Toy current = queue.poll();
String output = String.format("%d, %s, %d", current.getId(), current.getName(), current.getWeight());
System.out.println(output);
writeToOutputFile(output);
}
}
