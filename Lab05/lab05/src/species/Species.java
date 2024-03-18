package species;

public class Species {
    String genusName, speciesName;
    int chromosome2n, chromosomesX;

    public Species(String speciesName, String genusName, int chromosomeX) {
        this.speciesName = speciesName;
        this.genusName = genusName;
        this.chromosome2n = 2 * chromosomesX;
        this.chromosomesX = chromosomeX;
    }

    public void printNameFields() {
        System.out.println(this.speciesName + " " + this.genusName);
    }

    public void printHaploidalChromosomes() {
        System.out.println(this.chromosomesX);
    }

    public Species returnNewSpeciesObject() {
        return new Species(this.speciesName, this.genusName, this.chromosomesX);
    }
}
