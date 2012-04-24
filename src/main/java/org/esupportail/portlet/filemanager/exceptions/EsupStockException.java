/**
 * Copyright (C) 2012 Esup Portail http://www.esup-portail.org
 * Copyright (C) 2012 UNR RUNN http://www.unr-runn.fr
 * Copyright (C) 2012 RECIA http://www.recia.fr
 * @Author (C) 2012 Vincent Bonamy <Vincent.Bonamy@univ-rouen.fr>
 * @Contributor (C) 2012 Jean-Pierre Tran <Jean-Pierre.Tran@univ-rouen.fr>
 * @Contributor (C) 2012 Julien Marchal <Julien.Marchal@univ-nancy2.fr>
 * @Contributor (C) 2012 Julien Gribonvald <Julien.Gribonvald@recia.fr>
 * @Contributor (C) 2012 David Clarke <david.clarke@anu.edu.au>
 * @Contributor (C) 2012 BULL http://www.bull.fr
 * @Contributor (C) 2012 Pierre Bouvret <pierre.bouvret@u-bordeaux4.fr>
 * @Contributor (C) 2012 Franck Bordinat <franck.bordinat@univ-jfc.fr>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.esupportail.portlet.filemanager.exceptions;

import org.esupportail.commons.exceptions.EsupException;

public class EsupStockException extends EsupException {
	
	public EsupStockException(Exception e) {
		super(e);
	}

	public EsupStockException(String message) {
		super(message);
	}
	
	public EsupStockException(String message, Exception e) {
		super(message, e);
	}

	public String getRootCause() {
	    Throwable t = this;
	    while(t.getCause() != null)
		t = t.getCause();
	    return t.getMessage();
	}


	private static final long serialVersionUID = 1L;
	
}