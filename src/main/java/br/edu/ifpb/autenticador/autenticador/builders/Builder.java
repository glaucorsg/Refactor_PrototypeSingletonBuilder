package br.edu.ifpb.autenticador.autenticador.builders;

import br.edu.ifpb.autenticador.autenticador.domain.Address;
import br.edu.ifpb.autenticador.autenticador.domain.City;
import br.edu.ifpb.autenticador.autenticador.domain.Country;
import br.edu.ifpb.autenticador.autenticador.domain.State;

public interface Builder {

    Builder setStreet(Address rua);
    Builder setNumber(Address numero);
    Builder setNeighborhood(Address bairro);

    Builder setName(Country pais);

    Builder setName(State estado);
    Builder setCountry(State country);

    Builder setName(City cidade);
    Builder setState(City state);
    Builder setCity(City city);

}
