package mypackage;

import mypackage.Individual;

import java.lang.Math;
import java.util.Random;
import java.util.Properties;
import java.util.List;
import java.util.ArrayList;
import org.vu.contest.ContestEvaluation;

public class Population {
    public ArrayList<Individual> individuals;// ook een array list van make
    public Individual theFittest;
    public int populationSize;

    public int evaluations_limit;
    public int currentevaluations = 0;

    public double idfirstpop;
    double id = 0.0;

    //create an INITIAL population (so 1st time only)
    public Population(int populationSize, ContestEvaluation evaluation, boolean initialise) {
        this.individuals = new ArrayList<Individual>();
        this.populationSize = populationSize;
        if (initialise) {
            for (int i = 0; i < populationSize; i++) {
                individuals.add(new Individual(true, evaluation, id));
                currentevaluations++;
                id += 0.0001;
            }
        }
        //System.out.println(this.individuals);
    }


    public Individual getIndividual(int index) {
        return individuals.get(index);

    }

    public int size() {
        return individuals.size();
    }

    public void saveIndividual(Individual indiv) {
        individuals.add(indiv);

    }
    public void clear(){
        this.individuals.clear();
    }

    public double getmaxid(){
        return id;
    }

    public void removeIndiv(int index){
        individuals.remove(index);
    }




    //void sharedFitness() {
      //for(int i = 0; i<pop.sizeOfPopulation; i++) {

        //}
    //}

}

