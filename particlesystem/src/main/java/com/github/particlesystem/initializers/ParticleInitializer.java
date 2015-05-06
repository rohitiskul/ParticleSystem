package com.github.particlesystem.initializers;


import com.github.particlesystem.Particle;

import java.util.Random;

public interface ParticleInitializer {

    void initParticle(Particle p, Random r);

}
