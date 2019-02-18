package com.levkovskiy.patterncheatnote.structural.facade

class ComputerFacade {

    private val CPU = CPU()
    private val memory = Memory()
    private val hardDrive = HardDrive()

    private val BOOT_SECTOR: Long = 0L

    private val BOOT_ADDRESS: Long = 0

    private val SECTOR_SIZE: Int = 0

    fun start(){
        CPU.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        CPU.jump(BOOT_ADDRESS);
        CPU.execute();
    }

}