importar  java . útil . Scanner ;

 classe  pública BMEercicio06 {
    public  static  void  main ( String [] args ) {
        Scanner  sc = new  Scanner ( System . in );

        int  dia = 1 ;

        while ( dia != 0 ) {

            Sistema . fora . print ( "Informe um numero de 1 a 7: " );
            dia = sc . nextInt ();

            interruptor ( dia ) {
                caso  1 :
                    Sistema . fora . println ( "Dia da semana: Domingo\n" );
                    quebrar ;
                caso  2 :
                    Sistema . fora . println ( "Dia da semana: Segunda-feira\n" );
                    quebrar ;
                caso  3 :
                    Sistema . fora . println ( "Dia da semana: Terça-feira\n" );
                    quebrar ;
                caso  4 :
                    Sistema . fora . println ( "Dia da semana: Quarta-feira\n" );
                    quebrar ;
                caso  5 :
                    Sistema . fora . println ( "Dia da semana: Quinta-feira\n" );
                    quebrar ;
                caso  6 :
                    Sistema . fora . println ( "Dia da semana: Sexta-feira\n" );
                    quebrar ;
                caso  7 :
                    Sistema . fora . println ( "Dia da semana: Sábado\n" );
                    quebrar ;

                padrão :
                    Sistema . fora . println ( "Dia da semana inexistente\n" );
                    quebrar ;
            }
        }

        sc . fechar ();
    }
}
