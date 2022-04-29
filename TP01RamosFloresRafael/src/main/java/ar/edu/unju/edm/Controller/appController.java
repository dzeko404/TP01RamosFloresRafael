package ar.edu.unju.edm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto02;
import ar.edu.unju.edm.model.Punto03;
import ar.edu.unju.edm.model.Punto01;
import ar.edu.unju.edm.model.Punto04;
import ar.edu.unju.edm.model.Punto06;

@Controller
public class appController {

    @GetMapping({"/home", "/menu", "/index", "/principal"})
    public String home(){
        return "index";
    }
    
    // Punto 1


    // @Autowired
    // Factorial factorialNew;

    @GetMapping("/factorialNum")
    public String calcFactorial(@RequestParam(name = "num") int num, Model model){
        int resultadoS = 0;
        model.addAttribute("num", num);
        Punto01 fact = new Punto01();
        fact.setNum(num);
        resultadoS = fact.calcularFactorial(num);

        // factorialNew.setNum(num);
        // resultadoS = factorialNew.calcularFactorial(num);

        model.addAttribute("resultadoS", resultadoS);
        return "Punto01";
    }

    // Punto 2
    // Inyeccion de dependencias | ingestigar fnucionamiento 
    // @Autowired
    // Bisiesto nuevoBisiesto;

    @GetMapping("/verificarBisiesto")
    public String verfificarBisiesto(@RequestParam(name = "anio") int anio, Model model){

 

        String resultadoS = "";

        Punto02 bisiestoTrue = new Punto02();
        bisiestoTrue.setAnio(anio);
        resultadoS = bisiestoTrue.esBisiesto(anio);

        model.addAttribute("anio", anio);
        model.addAttribute("resultadoS", resultadoS);

        return"Punto02";
    }

    // Punto 3
    @GetMapping("/verificarPar")
    public String esPar(@RequestParam(name = "num1") int n1, @RequestParam(name = "num2") int n2, @RequestParam(name = "num3") int n3, @RequestParam(name = "num4") int n4, @RequestParam(name = "num5") int n5, Model model){
        // boolean resultado1 = false;
        // boolean resultado2 = false;
        // boolean resultado3 = false;
        // boolean resultado4 = false;
        // boolean resultado5 = false;

        String resultado1 = "";
        String resultado2 = "";
        String resultado3 = "";
        String resultado4 = "";
        String resultado5 = "";

        // Codigo para que en la Vista se vea el numero ingresado
        model.addAttribute("n1", n1);
        model.addAttribute("n2", n2);
        model.addAttribute("n3", n3);
        model.addAttribute("n4", n4);
        model.addAttribute("n5", n5);

        // Se cambio num.Par.verificarPar por numPar.comprobarPar para que devuelva un String en vezde Boleano

        // Verificacion del primer numero
        Punto03 numPar = new Punto03();
        numPar.setNumeroPar(n1);
        resultado1 = numPar.comprobraPar(n1);
        model.addAttribute("resultado1", resultado1);

        // Verificacion del segundo numero
        Punto03 num2Par = new Punto03();
        num2Par.setNumeroPar(n2);
        resultado2 = num2Par.comprobraPar(n2);
        model.addAttribute("resultado2", resultado2);

        // Verificacion del tercer numero
        Punto03 num3Par = new Punto03();
        num3Par.setNumeroPar(n3);
        resultado3 = num3Par.comprobraPar(n3);
        model.addAttribute("resultado3", resultado3);

        // Verificacion del cuarto numero
        Punto03 num4Par = new Punto03();
        num4Par.setNumeroPar(n4);
        resultado4 = num4Par.comprobraPar(n4);
        model.addAttribute("resultado4", resultado4);

        // Verificacion del quinto numero
        Punto03 num5Par = new Punto03();
        num5Par.setNumeroPar(n5);
        resultado5 = num5Par.comprobraPar(n5);
        model.addAttribute("resultado5", resultado5);
        
        return"Punto03";
    }


    @Autowired
    Punto02 nuevoBisiesto2;

    @GetMapping("/bisiesto.0")
    public ModelAndView getBisiesto(@RequestParam(name = "anio") int anio, Model model){
        String resultadoS = "";
        ModelAndView river = new ModelAndView("ansBisiesto");
        // nuveoBisiesto2.setAnio(anio);
        resultadoS = nuevoBisiesto2.esBisiesto(anio);
        return river;
    }

    // Punto 4
    @GetMapping("/mesDelAño")
    public String verificarMes(@RequestParam(name = "num") int num1, Model model){
        String resultadoS = "";

        model.addAttribute("num", num1);

        Punto04 esMes = new Punto04();
        esMes.setNumMes(num1);
        resultadoS = esMes.esMesDelAnio(num1);

        model.addAttribute("resultadoS", resultadoS);

        return "Punto04";
    }   

    // Punto 06
    @GetMapping("/nota")
    public String verificarNota(@RequestParam(name = "nota") int nota, Model model){
        String resultadoS = "";

        Punto06 notaVerificada = new Punto06();
        notaVerificada.setNota(nota);
        resultadoS = notaVerificada.verificarNota(nota);

        model.addAttribute("resultadoS", resultadoS);
        return "Punto06";
    }

    

}
