package no.hvl.dat110.system.controller;

import no.hvl.dat110.rpc.*;

public class DisplayStub extends RPCLocalStub {

	public DisplayStub(RPCClient rpcclient) {
		super(rpcclient);
	}
	
	public void write (String message) throws Exception {
		
		// TODO - START

		// marshall parameter to read call (void parameter)
		byte[] request = RPCUtils.marshallString(message);

		// make remote procedure call for read
		byte[] response = rpcclient.call((byte)Common.READ_RPCID, request);

		RPCUtils.unmarshallVoid(response);


		// unmarshall the return value from the call (an integer)



		// implement marshalling, call and unmarshalling for write RPC method
		
		// TODO - END
		
	}
}
