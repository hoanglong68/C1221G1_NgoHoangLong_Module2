package de_2.services;

import de_2.utils.NotFoundMedicalRecordException;

public interface IService {
    void hienThi();
    void xoa() throws NotFoundMedicalRecordException;
}
