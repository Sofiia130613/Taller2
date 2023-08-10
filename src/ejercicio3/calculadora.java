package ejercicio3;

public class calculadora {
    

        private int numero1;
        private int numero2;

        public calculadora(){

        }
        public calculadora(int numero1, int numero2){

            this.numero1 = numero1;
            this.numero2 = numero2;
        }

        public int sumar(){

            int sumar = this.numero1+this.numero2;
            return sumar;
        }

        public int restar(){

            int restar = this.numero1-this.numero2;
            return restar;
        }

        public int multiplicar(){

            int multiplicar = this.numero1*this.numero2;
            return multiplicar;
        }

        public double dividir(){

            double dividir = (double)this.numero1/(double)this.numero2;
            return dividir;
        }

        public int getNumero1(){
            return numero1;
        }
        
        public void setNumero1(int numero1){
            this.numero1 = numero1;
        }

    
        public int getNumero2(){
            return numero2;
        }
        
        public void setNumero2(int numero2){
            this.numero2 = numero2;
        }
}
