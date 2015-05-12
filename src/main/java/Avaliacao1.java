
import utfpr.ct.dainf.if62c.avaliacao.Complexo;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */
public class Avaliacao1 {
    public static Complexo[] raizesEquacao(Complexo a, Complexo b, Complexo c){
        Complexo delta;
        Complexo[] w ;
        Complexo b2;
        delta=a.prod(b);
        delta=delta.prod(-4);
        b2=b.prod(b);
        delta=b.sub(delta);
        w=delta.sqrt();
        b=b.prod(-1);
        a=a.prod(2);
        w[0]=b.soma(w[0]);
        w[0]=w[0].div(a);
        w[1]=b.soma(w[1]);
        w[1]=w[1].div(a);
        return  w;
    }

    public static void main(String[] args) {
        Complexo a = new Complexo (1,0);
        Complexo b = new Complexo (5,0);
        Complexo c = new Complexo (4,0);
        Complexo a1 = new Complexo (1,0);
        Complexo a2 = new Complexo (2,0);
        Complexo a3 = new Complexo (5,0);
        //Complexo[]w = raizesEquacao(a,b,c);
        //w=raizesEquacao(a,b,c);
        System.out.println(b.soma(a));
        //System.out.println(w[1]);
        
        // implementar main
    }
    
    // implementar raizesEquacao(Complexo, Complexo, Complexo)
    
}
