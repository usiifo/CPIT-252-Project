package stateClasses;

import proxyClasses.Service;

public class notFullState implements SectionState {
    @Override
    public boolean Check() {
        return true;
    }

}
