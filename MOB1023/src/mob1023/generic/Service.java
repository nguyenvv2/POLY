/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1023.generic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguyenvv
 */
public class Service<T> implements IService<T> {

    List<T> lstTemp = new ArrayList<>();

    @Override
    public List<T> getList() {
        return lstTemp;
    }

    @Override
    public Boolean add(T t) {
        lstTemp.add(t);
        return true;
    }

}
