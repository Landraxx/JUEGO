/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Alumno
 */
public class DAOJuegom {
 private String _VCH_NOMBRE_JUEGOM;
 private String _VCH_CATEGORIA_JUEGOM;
 private String _DATE_FECHA_JUEGOM;

    public String getVCH_NOMBRE_JUEGOM() {
        return _VCH_NOMBRE_JUEGOM;
    }

    public void setVCH_NOMBRE_JUEGOM(String _VCH_NOMBRE_JUEGOM) {
        this._VCH_NOMBRE_JUEGOM = _VCH_NOMBRE_JUEGOM;
    }

    public String getVCH_CATEGORIA_JUEGO() {
        return _VCH_CATEGORIA_JUEGOM;
    }

    public void setVCH_CATEGORIA_JUEGOM(String _VCH_CATEGORIA_JUEGO) {
        this._VCH_CATEGORIA_JUEGOM = _VCH_CATEGORIA_JUEGO;
    }

    public String getDATE_FECHA_JUEGOM() {
        return _DATE_FECHA_JUEGOM;
    }

    public void setDATE_FECHA_JUEGOM(String _DATE_FECHA_JUEGOM) {
        this._DATE_FECHA_JUEGOM = _DATE_FECHA_JUEGOM;
    }
 
 public Boolean ValidaSubida(String nom, String cat, String fec){
     Boolean flag = true;
     
     if(!nom.isEmpty()){setVCH_NOMBRE_JUEGOM(nom);
     }else 
     {return false;}
     
     if(!cat.isEmpty()){setVCH_CATEGORIA_JUEGOM(cat);
     }else
        {return false;}
     
     if(!fec.isEmpty()){setDATE_FECHA_JUEGOM(fec);
     }else 
     {return false;}
     
     return flag;
 }
    
    
    
    }
