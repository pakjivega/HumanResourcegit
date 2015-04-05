package com.pakjivega.prototypehumanresource.service;

import java.util.List;
import com.pakjivega.prototypehumanresource.bo.bean.Agency;

public interface AgencyService {
	Agency save(Agency agency);
	List<Agency> listAgencies(); 
}
