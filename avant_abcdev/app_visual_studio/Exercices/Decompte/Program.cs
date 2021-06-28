﻿ using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decompte
{
    class Program
    {
        static void Main(string[] args)
        {
            // Demander un nombre à l'utilisateur
            Console.WriteLine("Donnez un nombre de départ");
            String reponse = Console.ReadLine();
            int nb;

            // Tester si le nombre est correcte
            if(int.TryParse(reponse, out nb))
            { 
                // si oui : décompte
                while (nb >= 0)
                {
                    Console.WriteLine(nb);
                    nb--;
                }
            }
            else
            {
                // si non : afficher un message d'erreur
                Console.WriteLine("Désolé, votre nombre n'est pas correct");
            }


            // Fin du programme
            Console.ReadKey();
        }
    }
}
