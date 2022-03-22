package de_3.services;

import de_3.utils.NotFoundProductException;

public interface IService {
    void delete() throws NotFoundProductException;
    void display();
    void search();
}
