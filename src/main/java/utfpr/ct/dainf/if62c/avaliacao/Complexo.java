package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */
public class Complexo {
    private double real;
    private double img;
    private double roh;
    private double v1;
    private double v2;
    private double arco;
    

    public Complexo() {
    }

    public Complexo(double real, double img) {
        this.real=real;
        this.img=img;// completar a implementação
    }
    public double getReal(){// implementar getReal()
        return this.real;
    }
    public double getImg(){// implementar getImg()
        return this.img;
    }

    public Complexo soma(Complexo c) {
        return new Complexo(real + c.real, img + c.img);
    } 
    public Complexo sub(Complexo c) {// implementar sub(Complexo)
        return new Complexo(real - c.real, img - c.img);
    }
    public Complexo prod(double inteiro){// implementar prod(double)
        return new Complexo(inteiro*real,img*inteiro);
    }
    public Complexo prod(Complexo c){// implementar prod(Complexo)
        return new Complexo(real*c.real-img*c.img,img*c.real+real*c.img);
    }
    public Complexo div(Complexo c){// implementar div(Complexo)
        return new Complexo((real*c.real+img*c.img)/(c.real*c.real+c.img*c.img),(img*c.real-real*c.img)/(c.real*c.real+c.img*c.img));
    }   
    
    // implementar sqrt()
    public Complexo[] sqrt() {
        roh=Math.sqrt(real*real+img*img);
        roh=Math.sqrt(roh);
        Complexo[] raizes= new Complexo[2];
        int []a=new int [5];
        if(real>0)
            arco=Math.atan(img/real);
        else if(real<0)
            arco=Math.atan(img/real)+Math.PI;
        else if(real==0&&img==0)
            arco=0;
        else if(real==0&&img>0)
            arco=Math.PI/2;
        else 
            arco=Math.PI*3/4;
        v1=arco/2;
        v2=arco/2+Math.PI;
        raizes[0].real=(roh*Math.cos(v1));
        raizes[0].img=(roh*Math.sin(v1));
        raizes[1].real=(roh*Math.cos(v2));
        raizes[1].img=(roh*Math.sin(v2));
        // completar implementação
        // retornar o vetor contendo as raízes
        return raizes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (Double.doubleToLongBits(real)
            ^ (Double.doubleToLongBits(real) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(img)
            ^ (Double.doubleToLongBits(img) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        final Complexo c = (Complexo) obj;
        return obj != null && getClass() == obj.getClass()
            && real == c.real && img == c.img;
    }

    @Override
    public String toString() {
        return String.format("%+f%+fi", real, img);
    }
}
