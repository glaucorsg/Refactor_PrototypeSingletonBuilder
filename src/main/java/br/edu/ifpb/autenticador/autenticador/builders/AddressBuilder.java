package br.edu.ifpb.autenticador.autenticador.builders;

import br.edu.ifpb.autenticador.autenticador.domain.Address;
import br.edu.ifpb.autenticador.autenticador.domain.City;
import br.edu.ifpb.autenticador.autenticador.domain.Country;
import br.edu.ifpb.autenticador.autenticador.domain.State;

public class AddressBuilder implements Builder{

    private Address rua;
    private Address numero;
    private Address bairro;
    private Address address;

    private Country pais;
    private Country countryClass;

    private State estado;
    private State country;
    private State stateClass;

    private City cidade;
    private City state;
    private City city;


    @Override
    public AddressBuilder setStreet(Address rua) {
        this.rua = rua;
        return this;
    }

    @Override
    public AddressBuilder setNumber(Address numero) {
        this.numero = numero;
        return this;
    }

    @Override
    public AddressBuilder setNeighborhood(Address bairro) {
        this.bairro = bairro;
        return this;
    }

    @Override
    public AddressBuilder setName(Country pais) {
        this.pais = pais;
        return this;
    }

    @Override
    public AddressBuilder setName(State estado) {
        this.estado = estado;
        return this;
    }

    @Override
    public AddressBuilder setCountry(State country) {
        this.country = country;
        return this;
    }

    @Override
    public AddressBuilder setName(City cidade) {
        this.cidade = cidade;
        return this;
    }

    @Override
    public AddressBuilder setState(City state) {
        this.state = state;
        return this;
    }

    @Override
    public AddressBuilder setCity(City city) {
        this.city = city;
        return this;
    }

    public Address getResultAddress() {

        this.address = new Address();
        address.setStreet(rua.toString());
        address.setNumber(numero.toString());
        address.setNeighborhood(bairro.toString());

        return address;
    }

    public Country getResultCountry() {

        this.countryClass = new Country();
        country.setName(pais.toString());
        return this.countryClass;
    }


    public State getResultState() {
        this.stateClass = new State();
        stateClass.setName(estado.toString());
        stateClass.setCountry(countryClass);
        return this.stateClass;
    }

    public City getResultCity() {
        city = new City();
        city.setName(cidade.toString());
        city.setState(this.stateClass);
        this.address.setCity(city);
        return city;
    }
}
