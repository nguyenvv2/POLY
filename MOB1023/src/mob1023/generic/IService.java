/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mob1023.generic;

import java.util.List;

/**
 *
 * @author nguyenvv
 */
public interface IService<T> {

    public List<T> getList();

    public Boolean add(T t);
    
}
