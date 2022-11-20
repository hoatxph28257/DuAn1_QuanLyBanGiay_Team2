/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain_model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author tungs
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HDCT_ID implements Serializable {

    private String idHD;
    private String idSPCT;
}
