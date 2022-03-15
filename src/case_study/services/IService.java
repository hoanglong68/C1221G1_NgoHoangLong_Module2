package case_study.services;

public interface IService<E> {
    void read();
    void create(E e);
    void update(int index);
}
