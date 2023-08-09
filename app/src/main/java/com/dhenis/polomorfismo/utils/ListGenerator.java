package com.dhenis.polomorfismo.utils;

import com.dhenis.polomorfismo.madres.Mom;
import com.dhenis.polomorfismo.padres.Dad;

import java.util.ArrayList;
import java.util.List;

public class ListGenerator {
    public static List<Dad> generateDadList() {
        List<Dad> dadList = new ArrayList<>();
        dadList.add(new Dad(1, "https://cdn-icons-png.flaticon.com/512/2990/2990662.png", "John", "Doe", "Smith", "Arquitecto", 35, "C"));
        dadList.add(new Dad(2, "https://cdn-icons-png.flaticon.com/512/145/145859.png", "Michael", "Johnson", "Williams", "Ingeniero", 28, "S"));
        dadList.add(new Dad(3, "https://cdn-icons-png.flaticon.com/512/3063/3063194.png", "David", "Brown", "Jones", "Profesor", 45, "C"));
        dadList.add(new Dad(4, "https://cdn-icons-png.flaticon.com/512/3884/3884891.png", "Robert", "García", "Martínez", "Médico", 42, "S"));
        dadList.add(new Dad(5, "https://cdn-icons-png.flaticon.com/512/4202/4202841.png", "William", "Miller", "Rodríguez", "Abogado", 31, "C"));
        dadList.add(new Dad(6, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRuWZS_1eC5xPV9oHj1fNlCFsVkY_PKQzRtk0D2tmrvwvQQGrGaDQw6fR-880amrixcBDA&usqp=CAU", "Charles", "Davis", "López", "Artista", 29, "S"));
        dadList.add(new Dad(7, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDOXK9mwpSfsa-xjXoaYoElls3hxFH3Yz65EugCm5UEZS9gPy8BiFU_gk5kCFH1nipC6Q&usqp=CAU", "Joseph", "Moore", "Hernández", "Empresario", 38, "C"));
        dadList.add(new Dad(8, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTFJwomuxx7naSYPSnIKEgDk9j9PAUnr5ykhzDIiGhCznSl1vErEEeDYMp7GZYjpjkeu4&usqp=CAU", "Thomas", "Taylor", "Gómez", "Diseñador", 27, "S"));
        dadList.add(new Dad(9, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSgOX0xaEoGBloQG5xDy1MB5nHYfmq4_CsS1eW4YKD26ItHgO83cixYoaiCHyUBTzSDFY&usqp=CAU", "Daniel", "Anderson", "Pérez", "Científico", 50, "C"));
        dadList.add(new Dad(10, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQs7KyqNQss1Rna8iODRpg4rxxH9wx77nyckYhStV6AXOzf3HD1_TI2gQfSsc120D81Sno&usqp=CAU", "Paul", "Wilson", "Vargas", "Chef", 33, "S"));
        return dadList;
    }

    public static List<Mom> generateMomList() {
        List<Mom> momList = new ArrayList<>();
        momList.add(new Mom(1, "https://cdn-icons-png.flaticon.com/512/921/921018.png", "Elizabeth", "Martinez", "Cardenas", "Asistente", 35, "C"));
        momList.add(new Mom(2, "https://cdn-icons-png.flaticon.com/512/2335/2335114.png", "Xiomara", "Garcia", "Perez", "Desarolladora web", 28, "S"));
        momList.add(new Mom(3, "https://cdn-icons-png.flaticon.com/512/1941/1941154.png", "Maria", "Lopez", "Gonzalez", "Doctora", 42, "C"));
        momList.add(new Mom(4, "https://cdn-icons-png.flaticon.com/512/4086/4086609.png", "Ana", "Rodriguez", "Sanchez", "Ingeniera", 30, "S"));
        momList.add(new Mom(5, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRa-Y4i88_fSMNtC0aeTyT9YcS-6-VrIGxCSoCk_lUiDPxMxIotAUA8OPO_zzYrIEchcgA&usqp=CAU", "Laura", "Hernandez", "Ramirez", "Profesora", 29, "C"));
        momList.add(new Mom(6, "https://cdn-icons-png.flaticon.com/512/949/949635.png", "Sofia", "Flores", "Torres", "Diseñadora", 27, "S"));
        momList.add(new Mom(7, "https://cdn-icons-png.flaticon.com/512/949/949644.png", "Carolina", "Diaz", "Mendoza", "Empresaria", 38, "C"));
        momList.add(new Mom(8, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_u8I7QDt3AjWAgqQSKwL595-IzA3A7_cWvcqfXEPPtYXK2-NRHyDHZR9k9x4-Z2P0-I0&usqp=CAU", "Isabella", "Chavez", "Ortega", "Investigadora", 31, "S"));
        momList.add(new Mom(9, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPS_G5Xa_kVdNyFRSWoyUZZ7FrCvOpLTMsGY6AD-SCMCuj-JZHD0e8aM_KLRmDXx2znfQ&usqp=CAU", "Camila", "Gomez", "Vargas", "Artista", 40, "C"));
        momList.add(new Mom(10, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8_RfJxlPyS9l-HMvARDeJvdm9QAiocihdGUKNChq-H3Z5RgF86AmBcurdoLL4fiP4fV4&usqp=CAU", "Valentina", "Torres", "Alvarez", "Cocinera", 33, "S"));
        return momList;
    }

}
