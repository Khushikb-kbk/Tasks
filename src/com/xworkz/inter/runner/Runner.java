package com.xworkz.inter.runner;

import com.xworkz.inter.external.ConnectorImpl;
import com.xworkz.inter.external.ConnectorUser;
import com.xworkz.inter.internal.Connector;

public class Runner

{
    public static void main(String[]args){
        Connector connector=new ConnectorImpl();
        Connector Connector;
        ConnectorUser connectorUser=new ConnectorUser(connector);
        connectorUser.execute();
    }

}
