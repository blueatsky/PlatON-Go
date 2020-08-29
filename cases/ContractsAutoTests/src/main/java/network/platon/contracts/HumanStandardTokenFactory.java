package network.platon.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.GasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.13.0.7.
 */
public class HumanStandardTokenFactory extends Contract {
    private static final String BINARY = "60806040523480156200001157600080fd5b5060006200009e6127106040805190810160405280600c81526020017f56657269667920546f6b656e000000000000000000000000000000000000000081525060036040805190810160405280600381526020017f5654580000000000000000000000000000000000000000000000000000000000815250620000d9640100000000026401000000009004565b9050620000ba81620003e6640100000000026401000000009004565b60029080519060200190620000d192919062000411565b5050620004d1565b60008085858585620000ea62000498565b80858152602001806020018460ff1660ff16815260200180602001838103835286818151815260200191508051906020019080838360005b838110156200013f57808201518184015260208101905062000122565b50505050905090810190601f1680156200016d5780820380516001836020036101000a031916815260200191505b50838103825284818151815260200191508051906020019080838360005b83811015620001a85780820151818401526020810190506200018b565b50505050905090810190601f168015620001d65780820380516001836020036101000a031916815260200191505b509650505050505050604051809103906000f080158015620001fc573d6000803e3d6000fd5b5090506000803373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000208190806001815401808255809150509060018203906000526020600020016000909192909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505060018060008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff0219169083151502179055508073ffffffffffffffffffffffffffffffffffffffff1663a9059cbb33886040518363ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401808373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200182815260200192505050602060405180830381600087803b1580156200039c57600080fd5b505af1158015620003b1573d6000803e3d6000fd5b505050506040513d6020811015620003c857600080fd5b81019080805190602001909291905050505080915050949350505050565b6060813b6040519150601f19601f602083010116820160405280825280600060208401853c50919050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106200045457805160ff191683800117855562000485565b8280016001018555821562000485579182015b828111156200048457825182559160200191906001019062000467565b5b509050620004949190620004a9565b5090565b6040516111fb80620020d483390190565b620004ce91905b80821115620004ca576000816000905550600101620004b0565b5090565b90565b611bf380620004e16000396000f300608060405260043610610078576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806308216c0f1461007d5780635f8dead314610183578063acad94ae14610210578063d35b9d83146102a0578063ddea6df31461035c578063fc94dd18146103b7575b600080fd5b34801561008957600080fd5b5061014160048036038101908080359060200190929190803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284378201915050505050509192919290803560ff169060200190929190803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284378201915050505050509192919290505050610412565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34801561018f57600080fd5b506101ce600480360381019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190505050610713565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34801561021c57600080fd5b50610225610760565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561026557808201518184015260208101905061024a565b50505050905090810190601f1680156102925780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b3480156102ac57600080fd5b506102e1600480360381019080803573ffffffffffffffffffffffffffffffffffffffff1690602001909291905050506107fe565b6040518080602001828103825283818151815260200191508051906020019080838360005b83811015610321578082015181840152602081019050610306565b50505050905090810190601f16801561034e5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561036857600080fd5b5061039d600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610829565b604051808215151515815260200191505060405180910390f35b3480156103c357600080fd5b506103f8600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610849565b604051808215151515815260200191505060405180910390f35b600080858585856104216109bc565b80858152602001806020018460ff1660ff16815260200180602001838103835286818151815260200191508051906020019080838360005b83811015610474578082015181840152602081019050610459565b50505050905090810190601f1680156104a15780820380516001836020036101000a031916815260200191505b50838103825284818151815260200191508051906020019080838360005b838110156104da5780820151818401526020810190506104bf565b50505050905090810190601f1680156105075780820380516001836020036101000a031916815260200191505b509650505050505050604051809103906000f08015801561052c573d6000803e3d6000fd5b5090506000803373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000208190806001815401808255809150509060018203906000526020600020016000909192909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505060018060008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff0219169083151502179055508073ffffffffffffffffffffffffffffffffffffffff1663a9059cbb33886040518363ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401808373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200182815260200192505050602060405180830381600087803b1580156106cb57600080fd5b505af11580156106df573d6000803e3d6000fd5b505050506040513d60208110156106f557600080fd5b81019080805190602001909291905050505080915050949350505050565b60006020528160005260406000208181548110151561072e57fe5b906000526020600020016000915091509054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b60028054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156107f65780601f106107cb576101008083540402835291602001916107f6565b820191906000526020600020905b8154815290600101906020018083116107d957829003601f168201915b505050505081565b6060813b6040519150601f19601f602083010116820160405280825280600060208401853c50919050565b60016020528060005260406000206000915054906101000a900460ff1681565b600060606000610858846107fe565b91506002805460018160011615610100020316600290049050825114151561088357600092506109b5565b600090505b81518110156109b05760028181546001816001161561010002031660029004811015156108b157fe5b8154600116156108d05790600052602060002090602091828204019190065b9054901a7f0100000000000000000000000000000000000000000000000000000000000000027effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916828281518110151561092657fe5b9060200101517f010000000000000000000000000000000000000000000000000000000000000090047f0100000000000000000000000000000000000000000000000000000000000000027effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff19161415156109a357600092506109b5565b8080600101915050610888565b600192505b5050919050565b6040516111fb806109cd83390190560060806040526040805190810160405280600481526020017f48302e3100000000000000000000000000000000000000000000000000000000815250600690805190602001906200005192919062000144565b503480156200005f57600080fd5b50604051620011fb380380620011fb8339810180604052810190808051906020019092919080518201929190602001805190602001909291908051820192919050505083600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055508360008190555082600390805190602001906200010592919062000144565b5081600460006101000a81548160ff021916908360ff16021790555080600590805190602001906200013992919062000144565b5050505050620001f3565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106200018757805160ff1916838001178555620001b8565b82800160010185558215620001b8579182015b82811115620001b75782518255916020019190600101906200019a565b5b509050620001c79190620001cb565b5090565b620001f091905b80821115620001ec576000816000905550600101620001d2565b5090565b90565b610ff880620002036000396000f3006080604052600436106100af576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806306fdde03146100c1578063095ea7b31461015157806318160ddd146101b657806323b872dd146101e1578063313ce5671461026657806354fd4d501461029757806370a082311461032757806395d89b411461037e578063a9059cbb1461040e578063cae9ca5114610473578063dd62ed3e1461051e575b3480156100bb57600080fd5b50600080fd5b3480156100cd57600080fd5b506100d6610595565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156101165780820151818401526020810190506100fb565b50505050905090810190601f1680156101435780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561015d57600080fd5b5061019c600480360381019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190505050610633565b604051808215151515815260200191505060405180910390f35b3480156101c257600080fd5b506101cb610725565b6040518082815260200191505060405180910390f35b3480156101ed57600080fd5b5061024c600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff1690602001909291908035906020019092919050505061072b565b604051808215151515815260200191505060405180910390f35b34801561027257600080fd5b5061027b6109a7565b604051808260ff1660ff16815260200191505060405180910390f35b3480156102a357600080fd5b506102ac6109ba565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156102ec5780820151818401526020810190506102d1565b50505050905090810190601f1680156103195780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561033357600080fd5b50610368600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610a58565b6040518082815260200191505060405180910390f35b34801561038a57600080fd5b50610393610aa1565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156103d35780820151818401526020810190506103b8565b50505050905090810190601f1680156104005780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561041a57600080fd5b50610459600480360381019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190505050610b3f565b604051808215151515815260200191505060405180910390f35b34801561047f57600080fd5b50610504600480360381019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284378201915050505050509192919290505050610ca8565b604051808215151515815260200191505060405180910390f35b34801561052a57600080fd5b5061057f600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610f45565b6040518082815260200191505060405180910390f35b60038054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561062b5780601f106106005761010080835404028352916020019161062b565b820191906000526020600020905b81548152906001019060200180831161060e57829003601f168201915b505050505081565b600081600260003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055508273ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff167f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b925846040518082815260200191505060405180910390a36001905092915050565b60005481565b600081600160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054101580156107f8575081600260008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205410155b80156108045750600082115b1561099b5781600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000828254019250508190555081600160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000828254039250508190555081600260008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600082825403925050819055508273ffffffffffffffffffffffffffffffffffffffff168473ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef846040518082815260200191505060405180910390a3600190506109a0565b600090505b9392505050565b600460009054906101000a900460ff1681565b60068054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610a505780601f10610a2557610100808354040283529160200191610a50565b820191906000526020600020905b815481529060010190602001808311610a3357829003601f168201915b505050505081565b6000600160008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020549050919050565b60058054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610b375780601f10610b0c57610100808354040283529160200191610b37565b820191906000526020600020905b815481529060010190602001808311610b1a57829003601f168201915b505050505081565b600081600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205410158015610b905750600082115b15610c9d5781600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000828254039250508190555081600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600082825401925050819055508273ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef846040518082815260200191505060405180910390a360019050610ca2565b600090505b92915050565b600082600260003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055508373ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff167f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b925856040518082815260200191505060405180910390a38373ffffffffffffffffffffffffffffffffffffffff1660405180807f72656365697665417070726f76616c28616464726573732c75696e743235362c81526020017f616464726573732c627974657329000000000000000000000000000000000000815250602e01905060405180910390207c01000000000000000000000000000000000000000000000000000000009004338530866040518563ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401808573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018481526020018373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001828051906020019080838360005b83811015610ee9578082015181840152602081019050610ece565b50505050905090810190601f168015610f165780820380516001836020036101000a031916815260200191505b509450505050506000604051808303816000875af1925050501515610f3a57600080fd5b600190509392505050565b6000600260008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020549050929150505600a165627a7a723058203bcbf3396dd0bffbb445fa63cc221a1b13505e01a2a829b4e77c3ce0ab0b75f20029a165627a7a723058205e7e9dfcabc3e58b7b9e3b6c0fe443e21bd506e25028d467ab6cde609afdb06b002960806040526040805190810160405280600481526020017f48302e3100000000000000000000000000000000000000000000000000000000815250600690805190602001906200005192919062000144565b503480156200005f57600080fd5b50604051620011fb380380620011fb8339810180604052810190808051906020019092919080518201929190602001805190602001909291908051820192919050505083600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055508360008190555082600390805190602001906200010592919062000144565b5081600460006101000a81548160ff021916908360ff16021790555080600590805190602001906200013992919062000144565b5050505050620001f3565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106200018757805160ff1916838001178555620001b8565b82800160010185558215620001b8579182015b82811115620001b75782518255916020019190600101906200019a565b5b509050620001c79190620001cb565b5090565b620001f091905b80821115620001ec576000816000905550600101620001d2565b5090565b90565b610ff880620002036000396000f3006080604052600436106100af576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806306fdde03146100c1578063095ea7b31461015157806318160ddd146101b657806323b872dd146101e1578063313ce5671461026657806354fd4d501461029757806370a082311461032757806395d89b411461037e578063a9059cbb1461040e578063cae9ca5114610473578063dd62ed3e1461051e575b3480156100bb57600080fd5b50600080fd5b3480156100cd57600080fd5b506100d6610595565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156101165780820151818401526020810190506100fb565b50505050905090810190601f1680156101435780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561015d57600080fd5b5061019c600480360381019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190505050610633565b604051808215151515815260200191505060405180910390f35b3480156101c257600080fd5b506101cb610725565b6040518082815260200191505060405180910390f35b3480156101ed57600080fd5b5061024c600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff1690602001909291908035906020019092919050505061072b565b604051808215151515815260200191505060405180910390f35b34801561027257600080fd5b5061027b6109a7565b604051808260ff1660ff16815260200191505060405180910390f35b3480156102a357600080fd5b506102ac6109ba565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156102ec5780820151818401526020810190506102d1565b50505050905090810190601f1680156103195780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561033357600080fd5b50610368600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610a58565b6040518082815260200191505060405180910390f35b34801561038a57600080fd5b50610393610aa1565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156103d35780820151818401526020810190506103b8565b50505050905090810190601f1680156104005780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561041a57600080fd5b50610459600480360381019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190505050610b3f565b604051808215151515815260200191505060405180910390f35b34801561047f57600080fd5b50610504600480360381019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284378201915050505050509192919290505050610ca8565b604051808215151515815260200191505060405180910390f35b34801561052a57600080fd5b5061057f600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610f45565b6040518082815260200191505060405180910390f35b60038054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561062b5780601f106106005761010080835404028352916020019161062b565b820191906000526020600020905b81548152906001019060200180831161060e57829003601f168201915b505050505081565b600081600260003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055508273ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff167f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b925846040518082815260200191505060405180910390a36001905092915050565b60005481565b600081600160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054101580156107f8575081600260008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205410155b80156108045750600082115b1561099b5781600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000828254019250508190555081600160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000828254039250508190555081600260008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600082825403925050819055508273ffffffffffffffffffffffffffffffffffffffff168473ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef846040518082815260200191505060405180910390a3600190506109a0565b600090505b9392505050565b600460009054906101000a900460ff1681565b60068054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610a505780601f10610a2557610100808354040283529160200191610a50565b820191906000526020600020905b815481529060010190602001808311610a3357829003601f168201915b505050505081565b6000600160008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020549050919050565b60058054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610b375780601f10610b0c57610100808354040283529160200191610b37565b820191906000526020600020905b815481529060010190602001808311610b1a57829003601f168201915b505050505081565b600081600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205410158015610b905750600082115b15610c9d5781600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000828254039250508190555081600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600082825401925050819055508273ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef846040518082815260200191505060405180910390a360019050610ca2565b600090505b92915050565b600082600260003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055508373ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff167f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b925856040518082815260200191505060405180910390a38373ffffffffffffffffffffffffffffffffffffffff1660405180807f72656365697665417070726f76616c28616464726573732c75696e743235362c81526020017f616464726573732c627974657329000000000000000000000000000000000000815250602e01905060405180910390207c01000000000000000000000000000000000000000000000000000000009004338530866040518563ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401808573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018481526020018373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001828051906020019080838360005b83811015610ee9578082015181840152602081019050610ece565b50505050905090810190601f168015610f165780820380516001836020036101000a031916815260200191505b509450505050506000604051808303816000875af1925050501515610f3a57600080fd5b600190509392505050565b6000600260008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020549050929150505600a165627a7a723058203bcbf3396dd0bffbb445fa63cc221a1b13505e01a2a829b4e77c3ce0ab0b75f20029";

    public static final String FUNC_CREATEHUMANSTANDARDTOKEN = "createHumanStandardToken";

    public static final String FUNC_CREATED = "created";

    public static final String FUNC_HUMANSTANDARDBYTECODE = "humanStandardByteCode";

    public static final String FUNC_CODEAT = "codeAt";

    public static final String FUNC_ISHUMANTOKEN = "isHumanToken";

    public static final String FUNC_VERIFYHUMANSTANDARDTOKEN = "verifyHumanStandardToken";

    protected HumanStandardTokenFactory(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    protected HumanStandardTokenFactory(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public RemoteCall<TransactionReceipt> createHumanStandardToken(BigInteger _initialAmount, String _name, BigInteger _decimals, String _symbol) {
        final Function function = new Function(
                FUNC_CREATEHUMANSTANDARDTOKEN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_initialAmount), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.generated.Uint8(_decimals), 
                new org.web3j.abi.datatypes.Utf8String(_symbol)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> created(String param0, BigInteger param1) {
        final Function function = new Function(FUNC_CREATED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0), 
                new org.web3j.abi.datatypes.generated.Uint256(param1)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<byte[]> humanStandardByteCode() {
        final Function function = new Function(FUNC_HUMANSTANDARDBYTECODE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> codeAt(String _addr) {
        final Function function = new Function(
                FUNC_CODEAT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_addr)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> isHumanToken(String param0) {
        final Function function = new Function(FUNC_ISHUMANTOKEN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> verifyHumanStandardToken(String _tokenContract) {
        final Function function = new Function(
                FUNC_VERIFYHUMANSTANDARDTOKEN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_tokenContract)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<HumanStandardTokenFactory> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(HumanStandardTokenFactory.class, web3j, credentials, contractGasProvider, BINARY,  "", chainId);
    }

    public static RemoteCall<HumanStandardTokenFactory> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return deployRemoteCall(HumanStandardTokenFactory.class, web3j, transactionManager, contractGasProvider, BINARY,  "", chainId);
    }

    public static HumanStandardTokenFactory load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return new HumanStandardTokenFactory(contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    public static HumanStandardTokenFactory load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return new HumanStandardTokenFactory(contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }
}