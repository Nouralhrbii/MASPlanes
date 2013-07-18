/*
 * Copyright (c) 2013, Andrea Jeradi, Francesco Donato
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package ai.univr.dsa;

import es.csic.iiia.planes.Plane;
import es.csic.iiia.planes.Task;

/**
 *
 * @author Andrea Jeradi, Francesco Donato
 */
public abstract class AbstractTaskNode {
    
    private final Task t;
    private final Plane owner;
    private Plane value;
    private Plane old_value;
    
    public AbstractTaskNode(Task t, Plane own){
        this.t = t;
        this.owner = own;
        this.value = null;
        this.old_value = null;
    }
    
    public Task getTask(){
        
        return this.t;
        
    }
    
    public Plane getOwner(){
        
        return this.owner;
        
    }
    
    public Plane getValue(){
        
        return this.value;
        
    }
    
    public void setValue(Plane p){
        
        this.old_value = this.value;
        this.value = p;
        
    }
    
    public boolean isChanged(){
        
        return this.old_value == this.value;
        
    }
}
