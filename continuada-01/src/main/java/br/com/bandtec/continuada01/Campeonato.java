package br.com.bandtec.continuada01;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dominadores")
public class Campeonato{

private List<Dominador> listaDominadores = new ArrayList<Dominador>();

    @PostMapping("/criar/dominadorFogo")
    public ResponseEntity criarDominadorFogo(@RequestBody DominadorFogo novoDominadorFogo) {

        listaDominadores.add(novoDominadorFogo);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/criar/dominadorAgua")
    public ResponseEntity criarDominadorAgua(@RequestBody DominadorAgua novoDominadorAgua) {

        listaDominadores.add(novoDominadorAgua);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/criar/dominadorTerra")
    public ResponseEntity criarDominadorTerra(@RequestBody DominadorTerra novoDominadorTerra) {

        listaDominadores.add(novoDominadorTerra);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/criar/dominadorAr")
    public ResponseEntity criarDominadorAr(@RequestBody DominadorAr novoDominadorAr) {

        listaDominadores.add(novoDominadorAr);
        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public ResponseEntity listarDominadores(){
        return ResponseEntity.status(200).body(listaDominadores);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity matarDominador(@PathVariable int id) {
        if(listaDominadores.size() >= id){
            listaDominadores.remove(id-1);
            return ResponseEntity.status(202).build();
        }else{
            return ResponseEntity.status(204).build();
        }
    }

}

//Listar Lutadores fogo, agua, terra e ar
//Listar todos lutadores
//Lutar recebe dois lutadores
//Apagar lutador