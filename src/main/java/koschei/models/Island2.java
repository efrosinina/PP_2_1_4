package koschei.models;
/**
 * Данный класс не проаннотирован с помощью @Component,
 * <br>так как в классе AppConfig мы подтягиваем бин Island2 через метод getIsland.
 * <br>(@Bean используется для явного определения бинов в Java-конфигурации).
 */
public class Island2 {

    private Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
