package org.ifc.step.parser;
import org.ifc.ifc2x3tc1.*;public class ObjectFactorySwitch {
public static Object createInstance(String str) {
switch (str.length()){
    case 4:
        return new REAL();
    case 6:
        switch (str.charAt(0)){
            case 'B': return new BINARY();
            case 'S': return new STRING();
            case 'D': return new DOUBLE();
            default: return null;
        }
    case 7:
        switch (str.charAt(0)){
            case 'B': return new BOOLEAN();
            case 'I': 
                switch (str.charAt(1)){
                    case 'F': 
                        switch (str.charAt(3)){
                            case 'B': return new IfcBeam();
                            case 'D': return new IfcDoor();
                            case 'E': return new IfcEdge();
                            case 'F': return new IfcFace();
                            case 'G': return new IfcGrid();
                            case 'L': 
                                switch (str.charAt(4)){
                                    case 'I': return new IfcLine();
                                    case 'O': return new IfcLoop();
                                    default: return null;
                                }
                            case 'M': return new IfcMove();
                            case 'P': 
                                switch (str.charAt(4)){
                                    case 'A': return new IfcPath();
                                    case 'I': return new IfcPile();
                                    default: return null;
                                }
                            case 'R': 
                                switch (str.charAt(4)){
                                    case 'A': return new IfcRamp();
                                    case 'E': return new IfcReal();
                                    case 'O': return new IfcRoof();
                                    default: return null;
                                }
                            case 'S': 
                                switch (str.charAt(4)){
                                    case 'I': return new IfcSite();
                                    case 'L': return new IfcSlab();
                                    default: return null;
                                }
                            case 'T': 
                                switch (str.charAt(4)){
                                    case 'A': return new IfcTask();
                                    case 'E': return new IfcText();
                                    default: return null;
                                }
                            case 'W': return new IfcWall();
                            case 'Z': return new IfcZone();
                            default: return null;
                        }
                    case 'N': return new INTEGER();
                    default: return null;
                }
            case 'L': return new LOGICAL();
            default: return null;
        }
    case 8:
        switch (str.charAt(3)){
            case 'P': 
                switch (str.charAt(4)){
                    case 'R': return new IfcProxy();
                    case 'L': 
                        switch (str.charAt(6)){
                            case 'T': return new IfcPlate();
                            case 'N': return new IfcPlane();
                            default: return null;
                        }
                    default: return null;
                }
            case 'A': 
                switch (str.charAt(4)){
                    case 'S': return new IfcAsset();
                    case 'C': return new IfcActor();
                    default: return null;
                }
            case 'B': return new IfcBlock();
            case 'S': 
                switch (str.charAt(4)){
                    case 'P': return new IfcSpace();
                    case 'T': return new IfcStair();
                    default: return null;
                }
            case 'T': return new IfcTable();
            case 'G': return new IfcGroup();
            case 'L': return new IfcLabel();
            default: return null;
        }
    case 9:
        switch (str.charAt(0)){
            case 'F': return new File_Name();
            case 'I': 
                switch (str.charAt(3)){
                    case 'P': 
                        switch (str.charAt(6)){
                            case 'S': return new IfcPerson();
                            case 'M': return new IfcPermit();
                            default: return null;
                        }
                    case 'C': 
                        switch (str.charAt(4)){
                            case 'I': return new IfcCircle();
                            case 'O': return new IfcColumn();
                            default: return null;
                        }
                    case 'S': 
                        switch (str.charAt(4)){
                            case 'P': return new IfcSphere();
                            case 'Y': return new IfcSystem();
                            case 'I': return new IfcSIUnit();
                            default: return null;
                        }
                    case 'T': return new IfcTendon();
                    case 'V': 
                        switch (str.charAt(5)){
                            case 'R': return new IfcVertex();
                            case 'C': return new IfcVector();
                            default: return null;
                        }
                    case 'W': return new IfcWindow();
                    case 'M': 
                        switch (str.charAt(5)){
                            case 'T': return new IfcMetric();
                            case 'M': return new IfcMember();
                            default: return null;
                        }
                    default: return null;
                }
            default: return null;
        }
    case 10:
        switch (str.charAt(0)){
            case 'S': return new SchemaName();
            case 'I': 
                switch (str.charAt(3)){
                    case 'P': return new IfcProject();
                    case 'R': return new IfcRailing();
                    case 'B': return new IfcBoolean();
                    case 'S': return new IfcSubedge();
                    case 'E': return new IfcEllipse();
                    case 'F': 
                        switch (str.charAt(4)){
                            case 'A': return new IfcFanType();
                            case 'O': return new IfcFooting();
                            default: return null;
                        }
                    case 'I': return new IfcInteger();
                    case 'L': return new IfcLogical();
                    default: return null;
                }
            default: return null;
        }
    case 11:
        switch (str.charAt(0)){
            case 'F': return new File_Schema();
            case 'I': 
                switch (str.charAt(3)){
                    case 'A': return new IfcApproval();
                    case 'B': 
                        switch (str.charAt(4)){
                            case 'U': return new IfcBuilding();
                            case 'E': return new IfcBeamType();
                            default: return null;
                        }
                    case 'C': 
                        switch (str.charAt(4)){
                            case 'S': return new IfcCsgSolid();
                            case 'O': 
                                switch (str.charAt(5)){
                                    case 'S': return new IfcCostItem();
                                    case 'V': return new IfcCovering();
                                    case 'I': return new IfcCoilType();
                                    default: return null;
                                }
                            default: return null;
                        }
                    case 'E': return new IfcEdgeLoop();
                    case 'F': return new IfcFastener();
                    case 'G': return new IfcGridAxis();
                    case 'L': return new IfcLampType();
                    case 'M': return new IfcMaterial();
                    case 'O': return new IfcOccupant();
                    case 'P': 
                        switch (str.charAt(4)){
                            case 'U': return new IfcPumpType();
                            case 'O': 
                                switch (str.charAt(8)){
                                    case 'I': return new IfcPolyline();
                                    case 'O': return new IfcPolyLoop();
                                    default: return null;
                                }
                            default: return null;
                        }
                    case 'R': 
                        switch (str.charAt(4)){
                            case 'E': return new IfcRelNests();
                            case 'O': return new IfcRoleEnum();
                            default: return null;
                        }
                    case 'S': 
                        switch (str.charAt(4)){
                            case 'I': return new IfcSIPrefix();
                            case 'L': return new IfcSlabType();
                            default: return null;
                        }
                    case 'T': 
                        switch (str.charAt(4)){
                            case 'A': 
                                switch (str.charAt(5)){
                                    case 'B': return new IfcTableRow();
                                    case 'N': return new IfcTankType();
                                    default: return null;
                                }
                            case 'E': return new IfcTextPath();
                            default: return null;
                        }
                    case 'U': return new IfcUnitEnum();
                    case 'W': 
                        switch (str.charAt(4)){
                            case 'A': return new IfcWallType();
                            case 'O': return new IfcWorkPlan();
                            default: return null;
                        }
                    default: return null;
                }
            default: return null;
        }
    case 12:
        switch (str.charAt(3)){
            case 'A': 
                switch (str.charAt(4)){
                    case 'C': return new IfcActorRole();
                    case 'L': return new IfcAlarmType();
                    default: return null;
                }
            case 'C': 
                switch (str.charAt(5)){
                    case 'S': return new IfcCostValue();
                    case 'L': return new IfcColourRgb();
                    case 'N': return new IfcCondition();
                    default: return null;
                }
            case 'D': 
                switch (str.charAt(4)){
                    case 'I': return new IfcDirection();
                    case 'O': return new IfcDoorStyle();
                    default: return null;
                }
            case 'E': return new IfcEdgeCurve();
            case 'F': 
                switch (str.charAt(4)){
                    case 'A': return new IfcFaceBound();
                    case 'O': return new IfcFontStyle();
                    default: return null;
                }
            case 'H': return new IfcHourInDay();
            case 'I': return new IfcInventory();
            case 'L': return new IfcLocalTime();
            case 'N': return new IfcNullStyle();
            case 'O': 
                switch (str.charAt(4)){
                    case 'P': return new IfcOpenShell();
                    case 'B': return new IfcObjective();
                    default: return null;
                }
            case 'P': 
                switch (str.charAt(4)){
                    case 'R': return new IfcProcedure();
                    case 'H': return new IfcPHMeasure();
                    case 'L': 
                        switch (str.charAt(6)){
                            case 'T': return new IfcPlateType();
                            case 'N': return new IfcPlanarBox();
                            default: return null;
                        }
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'P': return new IfcSpaceType();
                    case 'T': return new IfcStateEnum();
                    default: return null;
                }
            case 'T': 
                switch (str.charAt(4)){
                    case 'E': return new IfcTextStyle();
                    case 'I': return new IfcTimeStamp();
                    default: return null;
                }
            case 'V': return new IfcValveType();
            default: return null;
        }
    case 13:
        switch (str.charAt(0)){
            case 'T': return new TimeStampText();
            case 'I': 
                switch (str.charAt(3)){
                    case 'A': return new IfcAnnotation();
                    case 'B': return new IfcBoilerType();
                    case 'C': 
                        switch (str.charAt(4)){
                            case 'U': return new IfcCurveStyle();
                            case 'O': return new IfcColumnType();
                            default: return null;
                        }
                    case 'D': return new IfcDamperType();
                    case 'F': 
                        switch (str.charAt(4)){
                            case 'I': return new IfcFilterType();
                            case 'O': return new IfcFontWeight();
                            default: return null;
                        }
                    case 'I': return new IfcIdentifier();
                    case 'M': 
                        switch (str.charAt(4)){
                            case 'A': return new IfcMappedItem();
                            case 'E': return new IfcMemberType();
                            default: return null;
                        }
                    case 'O': return new IfcOutletType();
                    case 'R': 
                        switch (str.charAt(4)){
                            case 'A': return new IfcRampFlight();
                            case 'E': return new IfcRelaxation();
                            default: return null;
                        }
                    case 'S': 
                        switch (str.charAt(4)){
                            case 'T': return new IfcStyledItem();
                            case 'E': return new IfcSensorType();
                            case 'I': return new IfcSIUnitName();
                            case 'O': return new IfcSoundValue();
                            default: return null;
                        }
                    case 'T': 
                        switch (str.charAt(4)){
                            case 'E': return new IfcTextureMap();
                            case 'Y': return new IfcTypeObject();
                            default: return null;
                        }
                    case 'V': return new IfcVertexLoop();
                    case 'Y': return new IfcYearNumber();
                    default: return null;
                }
            default: return null;
        }
    case 14:
        switch (str.charAt(3)){
            case 'A': 
                switch (str.charAt(4)){
                    case 'P': return new IfcApplication();
                    case 'R': return new IfcAreaMeasure();
                    default: return null;
                }
            case 'B': 
                switch (str.charAt(4)){
                    case 'E': return new IfcBezierCurve();
                    case 'L': return new IfcBlobTexture();
                    case 'O': return new IfcBoundingBox();
                    default: return null;
                }
            case 'C': 
                switch (str.charAt(4)){
                    case 'U': return new IfcCurtainWall();
                    case 'H': return new IfcChillerType();
                    case 'L': return new IfcClosedShell();
                    default: return null;
                }
            case 'D': 
                switch (str.charAt(4)){
                    case 'A': return new IfcDateAndTime();
                    case 'E': return new IfcDerivedUnit();
                    default: return null;
                }
            case 'F': 
                switch (str.charAt(4)){
                    case 'A': 
                        switch (str.charAt(5)){
                            case 'C': 
                                switch (str.charAt(7)){
                                    case 'S': return new IfcFaceSurface();
                                    case 'T': return new IfcFacetedBrep();
                                    default: return null;
                                }
                            case 'N': return new IfcFanTypeEnum();
                            default: return null;
                        }
                    case 'L': 
                        switch (str.charAt(7)){
                            case 'S': return new IfcFlowSegment();
                            case 'F': return new IfcFlowFitting();
                            default: return null;
                        }
                    case 'O': return new IfcFontVariant();
                    default: return null;
                }
            case 'M': return new IfcMassMeasure();
            case 'O': return new IfcOrderAction();
            case 'P': return new IfcPropertySet();
            case 'R': 
                switch (str.charAt(4)){
                    case 'A': return new IfcRailingType();
                    case 'E': return new IfcRelSequence();
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'T': return new IfcStairFlight();
                    case 'E': return new IfcServiceLife();
                    case 'U': return new IfcSurfaceSide();
                    case 'H': return new IfcShapeAspect();
                    case 'Y': return new IfcSymbolStyle();
                    default: return null;
                }
            case 'T': 
                switch (str.charAt(4)){
                    case 'E': return new IfcTextLiteral();
                    case 'I': return new IfcTimeMeasure();
                    case 'Y': return new IfcTypeProduct();
                    default: return null;
                }
            case 'V': return new IfcVertexPoint();
            case 'W': return new IfcWindowStyle();
            default: return null;
        }
    case 15:
        switch (str.charAt(3)){
            case 'A': return new IfcActuatorType();
            case 'B': 
                switch (str.charAt(4)){
                    case 'E': return new IfcBeamTypeEnum();
                    case 'O': return new IfcBoxAlignment();
                    default: return null;
                }
            case 'C': 
                switch (str.charAt(4)){
                    case 'A': return new IfcCalendarDate();
                    case 'R': return new IfcCrewResource();
                    case 'U': return new IfcCurrencyEnum();
                    case 'O': 
                        switch (str.charAt(5)){
                            case 'S': return new IfcCostSchedule();
                            case 'U': return new IfcCountMeasure();
                            case 'V': return new IfcCoveringType();
                            case 'I': return new IfcCoilTypeEnum();
                            default: return null;
                        }
                    default: return null;
                }
            case 'F': 
                switch (str.charAt(4)){
                    case 'A': return new IfcFastenerType();
                    case 'L': return new IfcFlowTerminal();
                    case 'O': return new IfcForceMeasure();
                    default: return null;
                }
            case 'G': return new IfcGeometricSet();
            case 'I': return new IfcImageTexture();
            case 'L': return new IfcLampTypeEnum();
            case 'M': 
                switch (str.charAt(4)){
                    case 'A': return new IfcMaterialList();
                    case 'I': return new IfcMinuteInHour();
                    case 'O': return new IfcMonetaryUnit();
                    default: return null;
                }
            case 'O': 
                switch (str.charAt(4)){
                    case 'R': 
                        switch (str.charAt(5)){
                            case 'G': return new IfcOrganization();
                            case 'I': return new IfcOrientedEdge();
                            default: return null;
                        }
                    case 'W': return new IfcOwnerHistory();
                    default: return null;
                }
            case 'P': 
                switch (str.charAt(4)){
                    case 'R': return new IfcProjectOrder();
                    case 'U': return new IfcPumpTypeEnum();
                    case 'I': 
                        switch (str.charAt(5)){
                            case 'X': return new IfcPixelTexture();
                            case 'L': return new IfcPileTypeEnum();
                            default: return null;
                        }
                    case 'L': return new IfcPlanarExtent();
                    case 'O': 
                        switch (str.charAt(5)){
                            case 'W': return new IfcPowerMeasure();
                            case 'I': return new IfcPointOnCurve();
                            default: return null;
                        }
                    default: return null;
                }
            case 'Q': 
                switch (str.charAt(11)){
                    case 'A': return new IfcQuantityArea();
                    case 'T': return new IfcQuantityTime();
                    default: return null;
                }
            case 'R': 
                switch (str.charAt(4)){
                    case 'A': 
                        switch (str.charAt(5)){
                            case 'T': return new IfcRatioMeasure();
                            case 'M': return new IfcRampTypeEnum();
                            default: return null;
                        }
                    case 'O': return new IfcRoofTypeEnum();
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'P': return new IfcSpaceProgram();
                    case 'U': return new IfcSurfaceStyle();
                    case 'E': return new IfcSequenceEnum();
                    case 'L': return new IfcSlabTypeEnum();
                    default: return null;
                }
            case 'T': 
                switch (str.charAt(4)){
                    case 'A': return new IfcTankTypeEnum();
                    case 'R': return new IfcTrimmedCurve();
                    case 'E': 
                        switch (str.charAt(5)){
                            case 'X': return new IfcTextFontName();
                            case 'N': return new IfcTendonAnchor();
                            default: return null;
                        }
                    default: return null;
                }
            case 'W': 
                switch (str.charAt(4)){
                    case 'A': return new IfcWallTypeEnum();
                    case 'O': return new IfcWorkSchedule();
                    default: return null;
                }
            default: return null;
        }
    case 16:
        switch (str.charAt(0)){
            case 'F': return new File_Description();
            case 'I': 
                switch (str.charAt(3)){
                    case 'A': 
                        switch (str.charAt(4)){
                            case 'C': return new IfcActionRequest();
                            case 'H': return new IfcAheadOrBehind();
                            case 'L': return new IfcAlarmTypeEnum();
                            default: return null;
                        }
                    case 'B': 
                        switch (str.charAt(4)){
                            case 'E': return new IfcBenchmarkEnum();
                            case 'O': return new IfcBooleanResult();
                            default: return null;
                        }
                    case 'C': 
                        switch (str.charAt(5)){
                            case 'M': return new IfcComplexNumber();
                            case 'N': return new IfcCondenserType();
                            default: return null;
                        }
                    case 'D': 
                        switch (str.charAt(4)){
                            case 'E': return new IfcDefinedSymbol();
                            case 'I': return new IfcDimensionPair();
                            default: return null;
                        }
                    case 'E': return new IfcEnergyMeasure();
                    case 'F': 
                        switch (str.charAt(4)){
                            case 'U': return new IfcFurnitureType();
                            case 'I': return new IfcFillAreaStyle();
                            case 'L': return new IfcFlowMeterType();
                            default: return null;
                        }
                    case 'G': return new IfcGridPlacement();
                    case 'L': 
                        switch (str.charAt(4)){
                            case 'A': return new IfcLaborResource();
                            case 'E': return new IfcLengthMeasure();
                            default: return null;
                        }
                    case 'M': return new IfcMaterialLayer();
                    case 'O': 
                        switch (str.charAt(4)){
                            case 'B': return new IfcObjectiveEnum();
                            case 'F': 
                                switch (str.charAt(14)){
                                    case '2': return new IfcOffsetCurve2D();
                                    case '3': return new IfcOffsetCurve3D();
                                    default: return null;
                                }
                            default: return null;
                        }
                    case 'P': 
                        switch (str.charAt(4)){
                            case 'L': return new IfcPlateTypeEnum();
                            case 'O': return new IfcPostalAddress();
                            default: return null;
                        }
                    case 'Q': return new IfcQuantityCount();
                    case 'R': 
                        switch (str.charAt(7)){
                            case 'S': return new IfcRelAssociates();
                            case 'G': return new IfcRelAggregates();
                            default: return null;
                        }
                    case 'S': 
                        switch (str.charAt(4)){
                            case 'P': return new IfcSpaceTypeEnum();
                            case 'T': return new IfcStairTypeEnum();
                            default: return null;
                        }
                    case 'T': 
                        switch (str.charAt(4)){
                            case 'E': 
                                switch (str.charAt(7)){
                                    case 'A': return new IfcTextAlignment();
                                    case 'U': return new IfcTextureVertex();
                                    default: return null;
                                }
                            case 'O': return new IfcTorqueMeasure();
                            default: return null;
                        }
                    case 'V': 
                        switch (str.charAt(4)){
                            case 'A': return new IfcValveTypeEnum();
                            case 'O': return new IfcVolumeMeasure();
                            default: return null;
                        }
                    default: return null;
                }
            default: return null;
        }
    case 17:
        switch (str.charAt(3)){
            case 'C':
                switch (str.charAt(4)){
                    case 'A': return new IfcCartesianPoint();
                    case 'U': return new IfcCurveStyleFont();
                    case 'L': return new IfcClassification();
                    case 'O':
                        switch (str.charAt(5)){
                            case 'L': return new IfcColumnTypeEnum();
                            case 'M':
                                switch (str.charAt(7)){
                                    case 'R': return new IfcCompressorType();
                                    case 'O': return new IfcCompositeCurve();
                                    default: return null;
                                }
                            case 'N':
                                switch (str.charAt(6)){
                                    case 'S': return new IfcConstraintEnum();
                                    case 'T': return new IfcControllerType();
                                    default: return null;
                                }
                            case 'O': return new IfcCooledBeamType();
                            default: return null;
                        }
                    default: return null;
                }
            case 'A': 
                switch (str.charAt(4)){
                    case 'C': return new IfcActionTypeEnum();
                    case 'X': return new IfcAxis1Placement();
                    default: return null;
                }
            case 'B': 
                switch (str.charAt(4)){
                    case 'U': return new IfcBuildingStorey();
                    case 'O': 
                        switch (str.charAt(5)){
                            case 'U': return new IfcBoundedSurface();
                            case 'X': return new IfcBoxedHalfSpace();
                            case 'I': return new IfcBoilerTypeEnum();
                            default: return null;
                        }
                    default: return null;
                }
            case 'D': 
                switch (str.charAt(4)){
                    case 'A': 
                        switch (str.charAt(5)){
                            case 'T': return new IfcDataOriginEnum();
                            case 'M': return new IfcDamperTypeEnum();
                            default: return null;
                        }
                    case 'I': 
                        switch (str.charAt(13)){
                            case 'U': return new IfcDimensionCurve();
                            case 'O': return new IfcDimensionCount();
                            default: return null;
                        }
                    default: return null;
                }
            case 'E': return new IfcEvaporatorType();
            case 'F': 
                switch (str.charAt(4)){
                    case 'A': return new IfcFaceOuterBound();
                    case 'U': return new IfcFuelProperties();
                    case 'I': return new IfcFilterTypeEnum();
                    case 'L': return new IfcFlowController();
                    default: return null;
                }
            case 'H': 
                switch (str.charAt(4)){
                    case 'A': return new IfcHalfSpaceSolid();
                    case 'U': return new IfcHumidifierType();
                    default: return null;
                }
            case 'L': return new IfcLocalPlacement();
            case 'M': return new IfcMemberTypeEnum();
            case 'N': return new IfcNumericMeasure();
            case 'O': 
                switch (str.charAt(4)){
                    case 'P': return new IfcOpeningElement();
                    case 'B': return new IfcObjectTypeEnum();
                    case 'U': return new IfcOutletTypeEnum();
                    default: return null;
                }
            case 'P': 
                switch (str.charAt(4)){
                    case 'A': return new IfcParameterValue();
                    case 'O': return new IfcPointOnSurface();
                    default: return null;
                }
            case 'Q': 
                switch (str.charAt(11)){
                    case 'V': return new IfcQuantityVolume();
                    case 'W': return new IfcQuantityWeight();
                    case 'L': return new IfcQuantityLength();
                    default: return null;
                }
            case 'R': 
                switch (str.charAt(4)){
                    case 'A': return new IfcRampFlightType();
                    case 'E': 
                        switch (str.charAt(5)){
                            case 'P': return new IfcRepresentation();
                            case 'I': return new IfcReinforcingBar();
                            default: return null;
                        }
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'E': 
                        switch (str.charAt(5)){
                            case 'C': 
                                switch (str.charAt(6)){
                                    case 'T': return new IfcSectionedSpine();
                                    case 'O': return new IfcSecondInMinute();
                                    default: return null;
                                }
                            case 'N': return new IfcSensorTypeEnum();
                            default: return null;
                        }
                    case 'W': return new IfcSweptDiskSolid();
                    case 'O': return new IfcSoundScaleEnum();
                    default: return null;
                }
            case 'T': 
                switch (str.charAt(4)){
                    case 'R': return new IfcTransitionCode();
                    case 'U': return new IfcTubeBundleType();
                    case 'E': 
                        switch (str.charAt(5)){
                            case 'X': return new IfcTextDecoration();
                            case 'L': return new IfcTelecomAddress();
                            case 'N': return new IfcTendonTypeEnum();
                            default: return null;
                        }
                    default: return null;
                }
            case 'U': return new IfcUnitAssignment();
            case 'V': return new IfcVirtualElement();
            default: return null;
        }
    case 18:
        switch (str.charAt(3)){
            case 'A': 
                switch (str.charAt(4)){
                    case 'D': return new IfcAddressTypeEnum();
                    case 'I': return new IfcAirTerminalType();
                    default: return null;
                }
            case 'B': return new IfcBooleanOperator();
            case 'C': 
                switch (str.charAt(4)){
                    case 'U': return new IfcCurtainWallType();
                    case 'H': return new IfcChillerTypeEnum();
                    case 'O': return new IfcComplexProperty();
                    default: return null;
                }
            case 'D': 
                switch (str.charAt(4)){
                    case 'U': 
                        switch (str.charAt(7)){
                            case 'S': return new IfcDuctSegmentType();
                            case 'F': return new IfcDuctFittingType();
                            default: return null;
                        }
                    case 'E': return new IfcDerivedUnitEnum();
                    default: return null;
                }
            case 'E': 
                switch (str.charAt(10)){
                    case 'Q': return new IfcElementQuantity();
                    case 'A': return new IfcElementAssembly();
                    default: return null;
                }
            case 'F': return new IfcFootingTypeEnum();
            case 'G': return new IfcGasTerminalType();
            case 'J': return new IfcJunctionBoxType();
            case 'L': 
                switch (str.charAt(5)){
                    case 'G': return new IfcLightSourceSpot();
                    case 'N': return new IfcLinearDimension();
                    default: return null;
                }
            case 'M': 
                switch (str.charAt(4)){
                    case 'E': return new IfcMeasureWithUnit();
                    case 'O': return new IfcMonetaryMeasure();
                    default: return null;
                }
            case 'P': 
                switch (str.charAt(4)){
                    case 'R': 
                        switch (str.charAt(5)){
                            case 'E': 
                                switch (str.charAt(7)){
                                    case 'S': return new IfcPressureMeasure();
                                    case 'E': return new IfcPresentableText();
                                    default: return null;
                                }
                            case 'O': 
                                switch (str.charAt(6)){
                                    case 'F': return new IfcProfileTypeEnum();
                                    case 'J': return new IfcProjectionCurve();
                                    default: return null;
                                }
                            default: return null;
                        }
                    case 'I': 
                        switch (str.charAt(7)){
                            case 'S': return new IfcPipeSegmentType();
                            case 'F': return new IfcPipeFittingType();
                            default: return null;
                        }
                    default: return null;
                }
            case 'R': 
                switch (str.charAt(4)){
                    case 'A': 
                        switch (str.charAt(5)){
                            case 'D': return new IfcRadiusDimension();
                            case 'I': return new IfcRailingTypeEnum();
                            default: return null;
                        }
                    case 'E': 
                        switch (str.charAt(5)){
                            case 'I': return new IfcReinforcingMesh();
                            case 'L': 
                                switch (str.charAt(6)){
                                    case 'A': return new IfcRelAssignsTasks();
                                    case 'C': return new IfcRelCoversSpaces();
                                    case 'F': return new IfcRelFillsElement();
                                    case 'V': return new IfcRelVoidsElement();
                                    default: return null;
                                }
                            default: return null;
                        }
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'P': return new IfcSpaceHeaterType();
                    case 'T': return new IfcStairFlightType();
                    case 'E': return new IfcSectionTypeEnum();
                    case 'O': return new IfcSoundProperties();
                    default: return null;
                }
            case 'T': 
                switch (str.charAt(4)){
                    case 'R': return new IfcTransformerType();
                    case 'I': return new IfcTimeSeriesValue();
                    default: return null;
                }
            case 'W': return new IfcWaterProperties();
            default: return null;
        }
    case 19:
        switch (str.charAt(3)){
            case 'A': 
                switch (str.charAt(4)){
                    case 'C': return new IfcActuatorTypeEnum();
                    case 'X': 
                        switch (str.charAt(17)){
                            case '2': return new IfcAxis2Placement2D();
                            case '3': return new IfcAxis2Placement3D();
                            default: return null;
                        }
                    case 'N': return new IfcAngularDimension();
                    default: return null;
                }
            case 'B': return new IfcBSplineCurveForm();
            case 'C': 
                switch (str.charAt(4)){
                    case 'A': return new IfcCableSegmentType();
                    case 'S': return new IfcCShapeProfileDef();
                    case 'U': return new IfcCurvatureMeasure();
                    case 'H': return new IfcChangeActionEnum();
                    case 'I': return new IfcCircleProfileDef();
                    case 'O': 
                        switch (str.charAt(5)){
                            case 'V': return new IfcCoveringTypeEnum();
                            case 'N': return new IfcConnectedFaceSet();
                            case 'O': return new IfcCoolingTowerType();
                            default: return null;
                        }
                    default: return null;
                }
            case 'D': 
                switch (str.charAt(4)){
                    case 'A': return new IfcDayInMonthNumber();
                    case 'U': return new IfcDuctSilencerType();
                    case 'I': return new IfcDistributionPort();
                    default: return null;
                }
            case 'E': 
                switch (str.charAt(4)){
                    case 'Q': return new IfcEquipmentElement();
                    case 'N': return new IfcEnergyProperties();
                    default: return null;
                }
            case 'F': 
                switch (str.charAt(4)){
                    case 'R': return new IfcFrequencyMeasure();
                    case 'L': return new IfcFlowMovingDevice();
                    default: return null;
                }
            case 'G': return new IfcGloballyUniqueId();
            case 'I': return new IfcIShapeProfileDef();
            case 'L': 
                switch (str.charAt(4)){
                    case 'S': return new IfcLShapeProfileDef();
                    case 'I': 
                        switch (str.charAt(5)){
                            case 'B': return new IfcLibraryReference();
                            case 'G': return new IfcLightFixtureType();
                            default: return null;
                        }
                    default: return null;
                }
            case 'M': return new IfcMaterialLayerSet();
            case 'O': return new IfcOccupantTypeEnum();
            case 'R': 
                switch (str.charAt(6)){
                    case 'S': return new IfcRelSpaceBoundary();
                    case 'C': return new IfcRelConnectsPorts();
                    case 'D': return new IfcRelDefinesByType();
                    default: return null;
                }
            case '2': return new Ifc2DCompositeCurve();
            case 'S': return new IfcSpecularExponent();
            case 'T': 
                switch (str.charAt(4)){
                    case 'R': return new IfcTransportElement();
                    case 'S': return new IfcTShapeProfileDef();
                    case 'E': return new IfcTerminatorSymbol();
                    default: return null;
                }
            case 'U': return new IfcUShapeProfileDef();
            case 'W': return new IfcWallStandardCase();
            case 'Z': return new IfcZShapeProfileDef();
            default: return null;
        }
    case 20:
        switch (str.charAt(3)){
            case 'A': 
                switch (str.charAt(4)){
                    case 'S': return new IfcAssemblyPlaceEnum();
                    case 'N': return new IfcAnnotationSurface();
                    default: return null;
                }
            case 'C': 
                switch (str.charAt(4)){
                    case 'U': return new IfcCurveBoundedPlane();
                    case 'O': return new IfcCondenserTypeEnum();
                    default: return null;
                }
            case 'D': 
                switch (str.charAt(4)){
                    case 'R': return new IfcDraughtingCallout();
                    case 'E': return new IfcDerivedProfileDef();
                    case 'I': 
                        switch (str.charAt(5)){
                            case 'A': return new IfcDiameterDimension();
                            case 'S': return new IfcDiscreteAccessory();
                            default: return null;
                        }
                    case 'O': return new IfcDocumentReference();
                    default: return null;
                }
            case 'E': 
                switch (str.charAt(4)){
                    case 'Q': return new IfcEquipmentStandard();
                    case 'X': return new IfcExtrudedAreaSolid();
                    case 'L': 
                        switch (str.charAt(5)){
                            case 'E': 
                                switch (str.charAt(11)){
                                    case 'A': 
                                        switch (str.charAt(13)){
                                            case 'C': return new IfcElectricalCircuit();
                                            case 'E': return new IfcElectricalElement();
                                            default: return null;
                                        }
                                    case 'M': return new IfcElectricMotorType();
                                    default: return null;
                                }
                            case 'L': return new IfcEllipseProfileDef();
                            default: return null;
                        }
                    default: return null;
                }
            case 'F': 
                switch (str.charAt(4)){
                    case 'U': 
                        switch (str.charAt(8)){
                            case 'S': return new IfcFurnishingElement();
                            case 'T': return new IfcFurnitureStandard();
                            default: return null;
                        }
                    case 'L': 
                        switch (str.charAt(7)){
                            case 'S': return new IfcFlowStorageDevice();
                            case 'D': return new IfcFlowDirectionEnum();
                            case 'M': return new IfcFlowMeterTypeEnum();
                            default: return null;
                        }
                    default: return null;
                }
            case 'G': 
                switch (str.charAt(4)){
                    case 'E': return new IfcGeometricCurveSet();
                    case 'L': return new IfcGlobalOrLocalEnum();
                    default: return null;
                }
            case 'H': return new IfcHeatExchangerType();
            case 'I': 
                switch (str.charAt(5)){
                    case 'D': return new IfcInductanceMeasure();
                    case 'V': return new IfcInventoryTypeEnum();
                    default: return null;
                }
            case 'L': return new IfcLoadGroupTypeEnum();
            case 'M': return new IfcMonthInYearNumber();
            case 'P': 
                switch (str.charAt(4)){
                    case 'R': 
                        switch (str.charAt(6)){
                            case 'P': return new IfcPropertyListValue();
                            case 'C': return new IfcProcedureTypeEnum();
                            case 'J': return new IfcProjectionElement();
                            default: return null;
                        }
                    case 'L': return new IfcPlaneAngleMeasure();
                    default: return null;
                }
            case 'R': 
                switch (str.charAt(4)){
                    case 'E': 
                        switch (str.charAt(5)){
                            case 'P': return new IfcRepresentationMap();
                            case 'V': return new IfcRevolvedAreaSolid();
                            case 'G': return new IfcRegularTimeSeries();
                            case 'L': 
                                switch (str.charAt(6)){
                                    case 'A': 
                                        switch (str.charAt(15)){
                                            case 'A': return new IfcRelAssignsToActor();
                                            case 'G': return new IfcRelAssignsToGroup();
                                            default: return null;
                                        }
                                    case 'O': return new IfcRelOccupiesSpaces();
                                    default: return null;
                                }
                            default: return null;
                        }
                    case 'I': return new IfcRightCircularCone();
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'P': return new IfcSpecularRoughness();
                    case 'T': return new IfcStackTerminalType();
                    case 'E': 
                        switch (str.charAt(5)){
                            case 'R': return new IfcServiceLifeFactor();
                            case 'C': return new IfcSectionProperties();
                            default: return null;
                        }
                    case 'O': 
                        switch (str.charAt(5)){
                            case 'U': return new IfcSoundPowerMeasure();
                            case 'L': return new IfcSolidAngleMeasure();
                            default: return null;
                        }
                    default: return null;
                }
            case 'W': return new IfcWasteTerminalType();
            default: return null;
        }
    case 21:
        switch (str.charAt(3)){
            case 'A': 
                switch (str.charAt(4)){
                    case 'I': return new IfcAirTerminalBoxType();
                    case 'N': return new IfcAnnotationFillArea();
                    default: return null;
                }
            case 'C': 
                switch (str.charAt(4)){
                    case 'H': return new IfcChamferEdgeFeature();
                    case 'L': return new IfcClassificationItem();
                    case 'O': 
                        switch (str.charAt(5)){
                            case 'M': return new IfcCompressorTypeEnum();
                            case 'N': 
                                switch (str.charAt(6)){
                                    case 'D': return new IfcConditionCriterion();
                                    case 'T': return new IfcControllerTypeEnum();
                                    case 'N': return new IfcConnectionTypeEnum();
                                    default: return null;
                                }
                            case 'O': return new IfcCooledBeamTypeEnum();
                            default: return null;
                        }
                    default: return null;
                }
            case 'D': 
                switch (str.charAt(4)){
                    case 'A': return new IfcDaylightSavingHour();
                    case 'E': 
                        switch (str.charAt(5)){
                            case 'R': return new IfcDerivedUnitElement();
                            case 'S': return new IfcDescriptiveMeasure();
                            default: return null;
                        }
                    case 'I': return new IfcDirectionSenseEnum();
                    case 'O': return new IfcDocumentStatusEnum();
                    default: return null;
                }
            case 'E': 
                switch (str.charAt(4)){
                    case 'V': return new IfcEvaporatorTypeEnum();
                    case 'L': return new IfcElectricHeaterType();
                    case 'N': return new IfcEnergySequenceEnum();
                    default: return null;
                }
            case 'F': 
                switch (str.charAt(4)){
                    case 'I': return new IfcFillAreaStyleTiles();
                    case 'L': return new IfcFlowInstrumentType();
                    default: return null;
                }
            case 'H': return new IfcHumidifierTypeEnum();
            case 'I': return new IfcIlluminanceMeasure();
            case 'L': 
                switch (str.charAt(5)){
                    case 'B': return new IfcLibraryInformation();
                    case 'G': return new IfcLightSourceAmbient();
                    case 'N': return new IfcLinearForceMeasure();
                    default: return null;
                }
            case 'M': 
                switch (str.charAt(4)){
                    case 'A': return new IfcMassDensityMeasure();
                    case 'E': return new IfcMechanicalFastener();
                    default: return null;
                }
            case 'P': 
                switch (str.charAt(4)){
                    case 'R': 
                        switch (str.charAt(6)){
                            case 'P': 
                                switch (str.charAt(11)){
                                    case 'S': return new IfcPropertySourceEnum();
                                    case 'T': return new IfcPropertyTableValue();
                                    default: return null;
                                }
                            case 'J': return new IfcProjectOrderRecord();
                            default: return null;
                        }
                    case 'E': return new IfcPerformanceHistory();
                    case 'L': return new IfcPlanarForceMeasure();
                    default: return null;
                }
            case 'R': 
                switch (str.charAt(4)){
                    case 'A': return new IfcRampFlightTypeEnum();
                    case 'E': 
                        switch (str.charAt(5)){
                            case 'C': return new IfcRectangularPyramid();
                            case 'L': return new IfcRelProjectsElement();
                            default: return null;
                        }
                    case 'O': return new IfcRoundedEdgeFeature();
                    default: return null;
                }
            case 'S': return new IfcSurfaceTextureEnum();
            case 'T': 
                switch (str.charAt(4)){
                    case 'R': return new IfcTrimmingPreference();
                    case 'E': 
                        switch (str.charAt(7)){
                            case 'S': 
                                switch (str.charAt(12)){
                                    case 'T': return new IfcTextStyleTextModel();
                                    case 'F': return new IfcTextStyleFontModel();
                                    default: return null;
                                }
                            case 'T': return new IfcTextTransformation();
                            default: return null;
                        }
                    case 'U': return new IfcTubeBundleTypeEnum();
                    case 'I': return new IfcTimeSeriesSchedule();
                    default: return null;
                }
            default: return null;
        }
    case 22:
        switch (str.charAt(3)){
            case 'A': 
                switch (str.charAt(4)){
                    case 'B': return new IfcAbsorbedDoseMeasure();
                    case 'C': return new IfcAccelerationMeasure();
                    case 'I': return new IfcAirTerminalTypeEnum();
                    default: return null;
                }
            case 'B': return new IfcBuildingElementPart();
            case 'C': 
                switch (str.charAt(4)){
                    case 'U': return new IfcCurtainWallTypeEnum();
                    case 'O': 
                        switch (str.charAt(5)){
                            case 'M': return new IfcCompositeProfileDef();
                            case 'N': return new IfcConversionBasedUnit();
                            default: return null;
                        }
                    default: return null;
                }
            case 'D': 
                switch (str.charAt(4)){
                    case 'U': 
                        switch (str.charAt(7)){
                            case 'S': return new IfcDuctSegmentTypeEnum();
                            case 'F': return new IfcDuctFittingTypeEnum();
                            default: return null;
                        }
                    case 'I': return new IfcDistributionElement();
                    case 'O': 
                        switch (str.charAt(5)){
                            case 'C': return new IfcDocumentInformation();
                            case 'O': return new IfcDoorPanelProperties();
                            default: return null;
                        }
                    default: return null;
                }
            case 'E': return new IfcElectricCurrentEnum();
            case 'F': 
                switch (str.charAt(5)){
                    case 'U': return new IfcFluidFlowProperties();
                    case 'O': return new IfcFlowTreatmentDevice();
                    default: return null;
                }
            case 'G': return new IfcGasTerminalTypeEnum();
            case 'H': return new IfcHeatingValueMeasure();
            case 'I': return new IfcIrregularTimeSeries();
            case 'J': return new IfcJunctionBoxTypeEnum();
            case 'L': 
                switch (str.charAt(4)){
                    case 'U': return new IfcLuminousFluxMeasure();
                    case 'I': return new IfcLinearMomentMeasure();
                    case 'O': return new IfcLogicalOperatorEnum();
                    default: return null;
                }
            case 'M': 
                switch (str.charAt(4)){
                    case 'A': 
                        switch (str.charAt(5)){
                            case 'S': return new IfcMassFlowRateMeasure();
                            case 'G': return new IfcMagneticFluxMeasure();
                            default: return null;
                        }
                    case 'O': return new IfcMotorConnectionType();
                    default: return null;
                }
            case 'P': 
                switch (str.charAt(4)){
                    case 'R': 
                        switch (str.charAt(11)){
                            case 'S': return new IfcPropertySingleValue();
                            case 'E': return new IfcPropertyEnumeration();
                            default: return null;
                        }
                    case 'I': 
                        switch (str.charAt(7)){
                            case 'S': return new IfcPipeSegmentTypeEnum();
                            case 'F': return new IfcPipeFittingTypeEnum();
                            default: return null;
                        }
                    default: return null;
                }
            case 'R': 
                switch (str.charAt(4)){
                    case 'A': return new IfcRationalBezierCurve();
                    case 'E': 
                        switch (str.charAt(5)){
                            case 'C': return new IfcRectangleProfileDef();
                            case 'L': 
                                switch (str.charAt(6)){
                                    case 'A': 
                                        switch (str.charAt(15)){
                                            case 'P': 
                                                switch (str.charAt(18)){
                                                    case 'C': return new IfcRelAssignsToProcess();
                                                    case 'D': return new IfcRelAssignsToProduct();
                                                    default: return null;
                                                }
                                            case 'C': return new IfcRelAssignsToControl();
                                            default: return null;
                                        }
                                    case 'C': return new IfcRelConnectsElements();
                                    default: return null;
                                }
                            default: return null;
                        }
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'P': return new IfcSpaceHeaterTypeEnum();
                    case 'C': return new IfcScheduleTimeControl();
                    case 'T': 
                        switch (str.charAt(5)){
                            case 'A': return new IfcStairFlightTypeEnum();
                            case 'R': return new IfcStructuralLoadGroup();
                            default: return null;
                        }
                    case 'U': 
                        switch (str.charAt(5)){
                            case 'R': 
                                switch (str.charAt(10)){
                                    case 'S': return new IfcSurfaceStyleShading();
                                    case 'O': return new IfcSurfaceOfRevolution();
                                    default: return null;
                                }
                            case 'B': return new IfcSubContractResource();
                            default: return null;
                        }
                    case 'E': return new IfcServiceLifeTypeEnum();
                    case 'W': return new IfcSwitchingDeviceType();
                    case 'H': 
                        switch (str.charAt(5)){
                            case 'A': return new IfcShapeRepresentation();
                            case 'E': return new IfcShearModulusMeasure();
                            default: return null;
                        }
                    default: return null;
                }
            case 'T': 
                switch (str.charAt(4)){
                    case 'R': 
                        switch (str.charAt(6)){
                            case 'P': return new IfcTrapeziumProfileDef();
                            case 'N': return new IfcTransformerTypeEnum();
                            default: return null;
                        }
                    case 'H': return new IfcThermalLoadTypeEnum();
                    default: return null;
                }
            case 'W': return new IfcWorkControlTypeEnum();
            default: return null;
        }
    case 23:
        switch (str.charAt(3)){
            case 'A': 
                switch (str.charAt(4)){
                    case 'P': return new IfcApprovalRelationship();
                    case 'C': return new IfcActionSourceTypeEnum();
                    default: return null;
                }
            case 'B': return new IfcBuildingElementProxy();
            case 'C': 
                switch (str.charAt(4)){
                    case 'A': return new IfcCableSegmentTypeEnum();
                    case 'E': return new IfcCenterLineProfileDef();
                    case 'U': return new IfcCurrencyRelationship();
                    case 'O': 
                        switch (str.charAt(5)){
                            case 'S': return new IfcCostScheduleTypeEnum();
                            case 'N': return new IfcContextDependentUnit();
                            case 'O': return new IfcCoolingTowerTypeEnum();
                            default: return null;
                        }
                    default: return null;
                }
            case 'D': 
                switch (str.charAt(4)){
                    case 'U': return new IfcDuctSilencerTypeEnum();
                    case 'I': 
                        switch (str.charAt(12)){
                            case 'A': return new IfcDimensionalExponents();
                            case 'E': return new IfcDimensionExtentUsage();
                            default: return null;
                        }
                    case 'O': return new IfcDoorLiningProperties();
                    default: return null;
                }
            case 'F': return new IfcFacetedBrepWithVoids();
            case 'L': return new IfcLightFixtureTypeEnum();
            case 'M': return new IfcMassPerLengthMeasure();
            case 'P': 
                switch (str.charAt(4)){
                    case 'R': 
                        switch (str.charAt(6)){
                            case 'P': return new IfcPropertyBoundedValue();
                            case 'T': return new IfcProtectiveDeviceType();
                            case 'J': return new IfcProjectOrderTypeEnum();
                            default: return null;
                        }
                    case 'I': return new IfcPileConstructionEnum();
                    case 'O': return new IfcPositiveRatioMeasure();
                    default: return null;
                }
            case 'R': 
                switch (str.charAt(4)){
                    case 'A': return new IfcRadioActivityMeasure();
                    case 'E': 
                        switch (str.charAt(6)){
                            case 'A': 
                                switch (str.charAt(9)){
                                    case 'I': return new IfcRelAssignsToResource();
                                    case 'O': return new IfcRelAssociatesLibrary();
                                    default: return null;
                                }
                            case 'S': return new IfcRelServicesBuildings();
                            default: return null;
                        }
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'A': return new IfcSanitaryTerminalType();
                    case 'T': return new IfcStyledRepresentation();
                    case 'U': return new IfcSurfaceStyleLighting();
                    case 'O': return new IfcSoundPressureMeasure();
                    default: return null;
                }
            case 'T': return new IfcTransportElementType();
            case 'U': return new IfcUnitaryEquipmentType();
            case 'W': return new IfcWarpingMomentMeasure();
            default: return null;
        }
    case 24:
        switch (str.charAt(3)){
            case 'A': return new IfcAnalysisModelTypeEnum();
            case 'B': 
                switch (str.charAt(5)){
                    case 'U': 
                        switch (str.charAt(11)){
                            case 'E': return new IfcBoundaryEdgeCondition();
                            case 'F': return new IfcBoundaryFaceCondition();
                            case 'N': return new IfcBoundaryNodeCondition();
                            default: return null;
                        }
                    case 'O': return new IfcBooleanClippingResult();
                    default: return null;
                }
            case 'C': 
                switch (str.charAt(4)){
                    case 'U': return new IfcCurveStyleFontPattern();
                    case 'O': return new IfcCompositeCurveSegment();
                    default: return null;
                }
            case 'D': 
                switch (str.charAt(4)){
                    case 'I': return new IfcDiscreteAccessoryType();
                    case 'O': 
                        switch (str.charAt(5)){
                            case 'S': return new IfcDoseEquivalentMeasure();
                            case 'O': return new IfcDoorPanelPositionEnum();
                            default: return null;
                        }
                    default: return null;
                }
            case 'E': 
                switch (str.charAt(4)){
                    case 'V': return new IfcEvaporativeCoolerType();
                    case 'L': 
                        switch (str.charAt(11)){
                            case 'A': return new IfcElectricApplianceType();
                            case 'C': return new IfcElectricChargeMeasure();
                            case 'G': return new IfcElectricGeneratorType();
                            case 'M': return new IfcElectricMotorTypeEnum();
                            default: return null;
                        }
                    default: return null;
                }
            case 'F': 
                switch (str.charAt(4)){
                    case 'A': return new IfcFaceBasedSurfaceModel();
                    case 'U': return new IfcFurnishingElementType();
                    case 'I': return new IfcFillAreaStyleHatching();
                    default: return null;
                }
            case 'H': return new IfcHeatExchangerTypeEnum();
            case 'L': 
                switch (str.charAt(4)){
                    case 'A': return new IfcLayerSetDirectionEnum();
                    case 'I': 
                        switch (str.charAt(5)){
                            case 'G': 
                                switch (str.charAt(8)){
                                    case 'S': return new IfcLightSourcePositional();
                                    case 'D': return new IfcLightDistributionData();
                                    default: return null;
                                }
                            case 'N': return new IfcLinearVelocityMeasure();
                            default: return null;
                        }
                    default: return null;
                }
            case 'M': return new IfcMaterialLayerSetUsage();
            case 'P': 
                switch (str.charAt(4)){
                    case 'R': return new IfcProductRepresentation();
                    case 'E': return new IfcPersonAndOrganization();
                    case 'H': return new IfcPhysicalOrVirtualEnum();
                    case 'O': return new IfcPositiveLengthMeasure();
                    default: return null;
                }
            case 'R': 
                switch (str.charAt(4)){
                    case 'E': 
                        switch (str.charAt(5)){
                            case 'P': return new IfcRepresentationContext();
                            case 'F': return new IfcReflectanceMethodEnum();
                            case 'L': 
                                switch (str.charAt(6)){
                                    case 'A': 
                                        switch (str.charAt(16)){
                                            case 'A': return new IfcRelAssociatesApproval();
                                            case 'D': return new IfcRelAssociatesDocument();
                                            case 'M': return new IfcRelAssociatesMaterial();
                                            default: return null;
                                        }
                                    case 'S': return new IfcRelSchedulesCostItems();
                                    case 'C': return new IfcRelCoversBldgElements();
                                    default: return null;
                                }
                            default: return null;
                        }
                    case 'I': 
                        switch (str.charAt(5)){
                            case 'B': return new IfcRibPlateDirectionEnum();
                            case 'G': return new IfcRightCircularCylinder();
                            default: return null;
                        }
                    case 'O': return new IfcRotationalMassMeasure();
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'T': 
                        switch (str.charAt(5)){
                            case 'A': return new IfcStackTerminalTypeEnum();
                            case 'R': 
                                switch (str.charAt(13)){
                                    case 'P': return new IfcStructuralPointAction();
                                    case 'R': return new IfcStructuralResultGroup();
                                    case 'C': return new IfcStructuralCurveMember();
                                    default: return null;
                                }
                            default: return null;
                        }
                    case 'U': return new IfcSurfaceStyleRendering();
                    case 'E': return new IfcSectionModulusMeasure();
                    default: return null;
                }
            case 'T': 
                switch (str.charAt(4)){
                    case 'E': return new IfcTextLiteralWithExtent();
                    case 'H': return new IfcThermalLoadSourceEnum();
                    default: return null;
                }
            case 'V': 
                switch (str.charAt(4)){
                    case 'E': return new IfcVertexBasedTextureMap();
                    case 'I': return new IfcVibrationIsolatorType();
                    default: return null;
                }
            case 'W': 
                switch (str.charAt(4)){
                    case 'A': return new IfcWasteTerminalTypeEnum();
                    case 'I': return new IfcWindowPanelProperties();
                    default: return null;
                }
            default: return null;
        }
    case 25:
        switch (str.charAt(3)){
            case 'A': 
                switch (str.charAt(4)){
                    case 'R': return new IfcArithmeticOperatorEnum();
                    case 'I': return new IfcAirTerminalBoxTypeEnum();
                    case 'N': 
                        switch (str.charAt(5)){
                            case 'A': return new IfcAnalysisTheoryTypeEnum();
                            case 'G': return new IfcAngularVelocityMeasure();
                            default: return null;
                        }
                    default: return null;
                }
            case 'C': 
                switch (str.charAt(4)){
                    case 'I': return new IfcCircleHollowProfileDef();
                    case 'L': return new IfcClassificationNotation();
                    case 'O': 
                        switch (str.charAt(6)){
                            case 'S': return new IfcConstraintRelationship();
                            case 'N': return new IfcConnectionPortGeometry();
                            default: return null;
                        }
                    default: return null;
                }
            case 'D': 
                switch (str.charAt(7)){
                    case 'P': return new IfcDoorPanelOperationEnum();
                    case 'S': return new IfcDoorStyleOperationEnum();
                    default: return null;
                }
            case 'E': 
                switch (str.charAt(4)){
                    case 'L': 
                        switch (str.charAt(6)){
                            case 'C': 
                                switch (str.charAt(11)){
                                    case 'C': return new IfcElectricCurrentMeasure();
                                    case 'V': return new IfcElectricVoltageMeasure();
                                    case 'H': return new IfcElectricHeaterTypeEnum();
                                    default: return null;
                                }
                            case 'M': return new IfcElementCompositionEnum();
                            default: return null;
                        }
                    case 'N': return new IfcEnergyConversionDevice();
                    default: return null;
                }
            case 'F': return new IfcFlowInstrumentTypeEnum();
            case 'H': return new IfcHeatFluxDensityMeasure();
            case 'I': return new IfcInternalOrExternalEnum();
            case 'L': 
                switch (str.charAt(5)){
                    case 'G': 
                        switch (str.charAt(14)){
                            case 'D': return new IfcLightSourceDirectional();
                            case 'G': return new IfcLightSourceGoniometric();
                            default: return null;
                        }
                    case 'N': return new IfcLinearStiffnessMeasure();
                    default: return null;
                }
            case 'M': 
                switch (str.charAt(4)){
                    case 'E': return new IfcMechanicalFastenerType();
                    case 'O': 
                        switch (str.charAt(5)){
                            case 'L': return new IfcMolecularWeightMeasure();
                            case 'M': return new IfcMomentOfInertiaMeasure();
                            default: return null;
                        }
                    default: return null;
                }
            case 'N': return new IfcNormalisedRatioMeasure();
            case 'P': 
                switch (str.charAt(6)){
                    case 'P': return new IfcPropertyReferenceValue();
                    case 'D': return new IfcProductDefinitionShape();
                    default: return null;
                }
            case 'R': 
                switch (str.charAt(5)){
                    case 'I': return new IfcReinforcingBarRoleEnum();
                    case 'L': 
                        switch (str.charAt(6)){
                            case 'D': return new IfcRelDefinesByProperties();
                            case 'F': return new IfcRelFlowControlElements();
                            case 'O': return new IfcRelOverridesProperties();
                            default: return null;
                        }
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'T': 
                        switch (str.charAt(13)){
                            case 'P': return new IfcStructuralPlanarAction();
                            case 'L': return new IfcStructuralLinearAction();
                            default: return null;
                        }
                    case 'U': return new IfcSurfaceStyleRefraction();
                    case 'H': return new IfcShellBasedSurfaceModel();
                    default: return null;
                }
            case 'T': 
                switch (str.charAt(4)){
                    case 'I': return new IfcTimeSeriesDataTypeEnum();
                    case 'O': return new IfcTopologyRepresentation();
                    default: return null;
                }
            case 'W': 
                switch (str.charAt(4)){
                    case 'A': return new IfcWarpingConstantMeasure();
                    case 'I': return new IfcWindowLiningProperties();
                    default: return null;
                }
            default: return null;
        }
    case 26:
        switch (str.charAt(3)){
            case 'A': return new IfcArbitraryOpenProfileDef();
            case 'C': 
                switch (str.charAt(4)){
                    case 'A': 
                        switch (str.charAt(15)){
                            case 'S': return new IfcCableCarrierSegmentType();
                            case 'F': return new IfcCableCarrierFittingType();
                            default: return null;
                        }
                    case 'L': return new IfcClassificationReference();
                    case 'O': 
                        switch (str.charAt(6)){
                            case 'T': return new IfcContextDependentMeasure();
                            case 'N': 
                                switch (str.charAt(13)){
                                    case 'P': return new IfcConnectionPointGeometry();
                                    case 'C': return new IfcConnectionCurveGeometry();
                                    default: return null;
                                }
                            default: return null;
                        }
                    default: return null;
                }
            case 'D': 
                switch (str.charAt(4)){
                    case 'I': 
                        switch (str.charAt(15)){
                            case 'E': return new IfcDistributionElementType();
                            case 'F': return new IfcDistributionFlowElement();
                            default: return null;
                        }
                    case 'Y': return new IfcDynamicViscosityMeasure();
                    default: return null;
                }
            case 'E': 
                switch (str.charAt(4)){
                    case 'X': return new IfcExternallyDefinedSymbol();
                    case 'L': 
                        switch (str.charAt(6)){
                            case 'C': return new IfcElectricTimeControlType();
                            case 'M': return new IfcElementAssemblyTypeEnum();
                            default: return null;
                        }
                    default: return null;
                }
            case 'G': return new IfcGeometricProjectionEnum();
            case 'I': 
                switch (str.charAt(4)){
                    case 'N': return new IfcIntegerCountRateMeasure();
                    case 'O': return new IfcIonConcentrationMeasure();
                    default: return null;
                }
            case 'L': return new IfcLightEmissionSourceEnum();
            case 'M': return new IfcMotorConnectionTypeEnum();
            case 'P': 
                switch (str.charAt(4)){
                    case 'R': return new IfcPropertyEnumeratedValue();
                    case 'H': return new IfcPhysicalComplexQuantity();
                    default: return null;
                }
            case 'R': 
                switch (str.charAt(5)){
                    case 'S': return new IfcResourceConsumptionEnum();
                    case 'F': return new IfcReferencesValueDocument();
                    case 'L': 
                        switch (str.charAt(6)){
                            case 'A': return new IfcRelAssociatesConstraint();
                            case 'C': return new IfcRelConnectsPathElements();
                            default: return null;
                        }
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'T': 
                        switch (str.charAt(13)){
                            case 'P': return new IfcStructuralPointReaction();
                            case 'A': return new IfcStructuralAnalysisModel();
                            case 'C': return new IfcStructuralCurveTypeEnum();
                            case 'S': return new IfcStructuralSurfaceMember();
                            default: return null;
                        }
                    case 'W': return new IfcSwitchingDeviceTypeEnum();
                    default: return null;
                }
            case 'T': return new IfcTextStyleForDefinedFont();
            case 'V': return new IfcVirtualGridIntersection();
            case 'W': return new IfcWindowPanelPositionEnum();
            default: return null;
        }
    case 27:
        switch (str.charAt(3)){
            case 'A': 
                switch (str.charAt(4)){
                    case 'P': return new IfcAppliedValueRelationship();
                    case 'I': return new IfcAirToAirHeatRecoveryType();
                    case 'M': return new IfcAmountOfSubstanceMeasure();
                    case 'N': return new IfcAnnotationTextOccurrence();
                    default: return null;
                }
            case 'B': return new IfcBuildingElementProxyType();
            case 'C': return new IfcCurveStyleFontAndScaling();
            case 'D': 
                switch (str.charAt(4)){
                    case 'I': return new IfcDimensionCurveTerminator();
                    case 'O': return new IfcDocumentElectronicFormat();
                    default: return null;
                }
            case 'E': 
                switch (str.charAt(4)){
                    case 'L': return new IfcElectricalBaseProperties();
                    case 'N': return new IfcEnvironmentalImpactValue();
                    default: return null;
                }
            case 'G': return new IfcGeneralProfileProperties();
            case 'I': return new IfcIrregularTimeSeriesValue();
            case 'L': return new IfcLuminousIntensityMeasure();
            case 'O': 
                switch (str.charAt(4)){
                    case 'R': return new IfcOrganizationRelationship();
                    case 'N': return new IfcOneDirectionRepeatFactor();
                    default: return null;
                }
            case 'P': return new IfcProtectiveDeviceTypeEnum();
            case 'R': 
                switch (str.charAt(6)){
                    case 'A': return new IfcRelAssignsToProjectOrder();
                    case 'C': return new IfcRelConnectsPortToElement();
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'A': return new IfcSanitaryTerminalTypeEnum();
                    case 'U': 
                        switch (str.charAt(10)){
                            case 'S': return new IfcSurfaceStyleWithTextures();
                            case 'O': return new IfcSurfaceOfLinearExtrusion();
                            default: return null;
                        }
                    default: return null;
                }
            case 'T': 
                switch (str.charAt(4)){
                    case 'R': return new IfcTransportElementTypeEnum();
                    case 'W': return new IfcTwoDirectionRepeatFactor();
                    case 'H': 
                        switch (str.charAt(10)){
                            case 'A': return new IfcThermalAdmittanceMeasure();
                            case 'R': return new IfcThermalResistanceMeasure();
                            default: return null;
                        }
                    default: return null;
                }
            case 'U': return new IfcUnitaryEquipmentTypeEnum();
            case 'V': return new IfcVaporPermeabilityMeasure();
            case 'W': 
                switch (str.charAt(9)){
                    case 'P': return new IfcWindowPanelOperationEnum();
                    case 'S': return new IfcWindowStyleOperationEnum();
                    default: return null;
                }
            default: return null;
        }
    case 28:
        switch (str.charAt(3)){
            case 'P': 
                switch (str.charAt(4)){
                    case 'R': 
                        switch (str.charAt(5)){
                            case 'E': return new IfcPreDefinedDimensionSymbol();
                            case 'O': return new IfcProjectedOrTrueLengthEnum();
                            default: return null;
                        }
                    case 'O': 
                        switch (str.charAt(5)){
                            case 'S': return new IfcPositivePlaneAngleMeasure();
                            case 'L': return new IfcPolygonalBoundedHalfSpace();
                            default: return null;
                        }
                    default: return null;
                }
            case 'A': 
                switch (str.charAt(4)){
                    case 'P': return new IfcApprovalActorRelationship();
                    case 'R': return new IfcArbitraryClosedProfileDef();
                    case 'N': return new IfcAnnotationCurveOccurrence();
                    default: return null;
                }
            case 'R': 
                switch (str.charAt(4)){
                    case 'E': 
                        switch (str.charAt(5)){
                            case 'C': 
                                switch (str.charAt(10)){
                                    case 'U': return new IfcRectangularTrimmedSurface();
                                    case 'L': return new IfcRectangleHollowProfileDef();
                                    default: return null;
                                }
                            case 'I': return new IfcReinforcingBarSurfaceEnum();
                            case 'L': return new IfcRelAssociatesAppliedValue();
                            default: return null;
                        }
                    case 'I': return new IfcRibPlateProfileProperties();
                    default: return null;
                }
            case 'C': 
                switch (str.charAt(4)){
                    case 'R': 
                        switch (str.charAt(12)){
                            case 'A': return new IfcCraneRailAShapeProfileDef();
                            case 'F': return new IfcCraneRailFShapeProfileDef();
                            default: return null;
                        }
                    case 'O': 
                        switch (str.charAt(5)){
                            case 'M': return new IfcCompoundPlaneAngleMeasure();
                            case 'N': return new IfcConnectionSurfaceGeometry();
                            default: return null;
                        }
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'T': 
                        switch (str.charAt(13)){
                            case 'P': return new IfcStructuralPointConnection();
                            case 'S': return new IfcStructuralSurfaceTypeEnum();
                            case 'C': return new IfcStructuralCurveConnection();
                            case 'L': 
                                switch (str.charAt(17)){
                                    case 'P': return new IfcStructuralLoadPlanarForce();
                                    case 'S': return new IfcStructuralLoadSingleForce();
                                    case 'T': return new IfcStructuralLoadTemperature();
                                    case 'L': return new IfcStructuralLoadLinearForce();
                                    default: return null;
                                }
                            default: return null;
                        }
                    case 'E': return new IfcServiceLifeFactorTypeEnum();
                    default: return null;
                }
            case 'D': return new IfcDoorStyleConstructionEnum();
            case 'T': return new IfcThermalMaterialProperties();
            case 'E': 
                switch (str.charAt(4)){
                    case 'V': return new IfcEvaporativeCoolerTypeEnum();
                    case 'X': return new IfcExternallyDefinedTextFont();
                    case 'L': 
                        switch (str.charAt(11)){
                            case 'A': return new IfcElectricApplianceTypeEnum();
                            case 'R': return new IfcElectricResistanceMeasure();
                            case 'D': return new IfcElectricDistributionPoint();
                            case 'G': return new IfcElectricGeneratorTypeEnum();
                            default: return null;
                        }
                    default: return null;
                }
            case 'V': 
                switch (str.charAt(4)){
                    case 'I': return new IfcVibrationIsolatorTypeEnum();
                    case 'O': return new IfcVolumetricFlowRateMeasure();
                    default: return null;
                }
            case 'G': return new IfcGeneralMaterialProperties();
            case 'K': return new IfcKinematicViscosityMeasure();
            case 'O': return new IfcOpticalMaterialProperties();
            default: return null;
        }
    case 29:
        switch (str.charAt(3)){
            case 'P': 
                switch (str.charAt(5)){
                    case 'E': 
                        switch (str.charAt(6)){
                            case 'S': return new IfcPresentationLayerWithStyle();
                            case 'D': return new IfcPreDefinedTerminatorSymbol();
                            default: return null;
                        }
                    case 'O': return new IfcProjectOrderRecordTypeEnum();
                    default: return null;
                }
            case 'A': 
                switch (str.charAt(4)){
                    case 'S': return new IfcAsymmetricIShapeProfileDef();
                    case 'N': return new IfcAnnotationSymbolOccurrence();
                    default: return null;
                }
            case 'R': 
                switch (str.charAt(4)){
                    case 'E': 
                        switch (str.charAt(5)){
                            case 'I': return new IfcReinforcementBarProperties();
                            case 'L': return new IfcRelInteractionRequirements();
                            default: return null;
                        }
                    case 'O': 
                        switch (str.charAt(5)){
                            case 'T': 
                                switch (str.charAt(13)){
                                    case 'S': return new IfcRotationalStiffnessMeasure();
                                    case 'F': return new IfcRotationalFrequencyMeasure();
                                    default: return null;
                                }
                            case 'U': return new IfcRoundedRectangleProfileDef();
                            default: return null;
                        }
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'P': return new IfcSpaceThermalLoadProperties();
                    case 'T': return new IfcStructuredDimensionCallout();
                    case 'U': return new IfcSurfaceCurveSweptAreaSolid();
                    case 'Y': return new IfcSystemFurnitureElementType();
                    default: return null;
                }
            case 'T': 
                switch (str.charAt(4)){
                    case 'E': 
                        switch (str.charAt(5)){
                            case 'X': return new IfcTextureCoordinateGenerator();
                            case 'M': return new IfcTemperatureGradientMeasure();
                            default: return null;
                        }
                    case 'H': return new IfcThermalConductivityMeasure();
                    case 'I': return new IfcTimeSeriesScheduleTypeEnum();
                    default: return null;
                }
            case 'D': 
                switch (str.charAt(4)){
                    case 'R': return new IfcDraughtingPreDefinedColour();
                    case 'I': 
                        switch (str.charAt(16)){
                            case 'H': return new IfcDistributionChamberElement();
                            case 'O': return new IfcDistributionControlElement();
                            default: return null;
                        }
                    default: return null;
                }
            case 'E': 
                switch (str.charAt(4)){
                    case 'X': return new IfcExtendedMaterialProperties();
                    case 'L': 
                        switch (str.charAt(12)){
                            case 'A': return new IfcElectricCapacitanceMeasure();
                            case 'O': return new IfcElectricConductanceMeasure();
                            default: return null;
                        }
                    default: return null;
                }
            case 'F': return new IfcFailureConnectionCondition();
            case 'L': 
                switch (str.charAt(8)){
                    case 'D': return new IfcLightDistributionCurveEnum();
                    case 'I': return new IfcLightIntensityDistribution();
                    default: return null;
                }
            case 'M': 
                switch (str.charAt(4)){
                    case 'A': return new IfcMagneticFluxDensityMeasure();
                    case 'O': 
                        switch (str.charAt(5)){
                            case 'D': return new IfcModulusOfElasticityMeasure();
                            case 'I': return new IfcMoistureDiffusivityMeasure();
                            default: return null;
                        }
                    default: return null;
                }
            default: return null;
        }
    case 30:
        switch (str.charAt(3)){
            case 'P': 
                switch (str.charAt(4)){
                    case 'R': 
                        switch (str.charAt(6)){
                            case 'S': 
                                switch (str.charAt(15)){
                                    case 'S': return new IfcPresentationStyleAssignment();
                                    case 'L': return new IfcPresentationLayerAssignment();
                                    default: return null;
                                }
                            case 'D': return new IfcPreDefinedPointMarkerSymbol();
                            default: return null;
                        }
                    case 'E': return new IfcPermeableCoveringProperties();
                    default: return null;
                }
            case 'A': return new IfcAnnotationSurfaceOccurrence();
            case 'R': 
                switch (str.charAt(6)){
                    case 'A': return new IfcRelAssociatesClassification();
                    case 'C': 
                        switch (str.charAt(14)){
                            case 'S': return new IfcRelConnectsStructuralMember();
                            case 'W': return new IfcRelConnectsWithEccentricity();
                            default: return null;
                        }
                    default: return null;
                }
            case 'C': 
                switch (str.charAt(4)){
                    case 'A': 
                        switch (str.charAt(15)){
                            case 'S': return new IfcCableCarrierSegmentTypeEnum();
                            case 'F': return new IfcCableCarrierFittingTypeEnum();
                            default: return null;
                        }
                    case 'L': return new IfcClassificationNotationFacet();
                    case 'O': 
                        switch (str.charAt(6)){
                            case 'S': return new IfcConstructionProductResource();
                            case 'N': return new IfcConnectionPointEccentricity();
                            default: return null;
                        }
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'P': return new IfcSpecificHeatCapacityMeasure();
                    case 'T': 
                        switch (str.charAt(13)){
                            case 'P': return new IfcStructuralProfileProperties();
                            case 'S': return new IfcStructuralSurfaceConnection();
                            default: return null;
                        }
                    case 'L': return new IfcSlippageConnectionCondition();
                    default: return null;
                }
            case 'T': return new IfcThermalTransmittanceMeasure();
            case 'D': return new IfcDocumentConfidentialityEnum();
            case 'E': 
                switch (str.charAt(4)){
                    case 'X': return new IfcExternallyDefinedHatchStyle();
                    case 'L': return new IfcElectricTimeControlTypeEnum();
                    default: return null;
                }
            case 'F': return new IfcFireSuppressionTerminalType();
            case 'W': return new IfcWindowStyleConstructionEnum();
            default: return null;
        }
    case 31:
        switch (str.charAt(3)){
            case 'A': 
                switch (str.charAt(4)){
                    case 'P': return new IfcApprovalPropertyRelationship();
                    case 'R': return new IfcArbitraryProfileDefWithVoids();
                    case 'I': return new IfcAirToAirHeatRecoveryTypeEnum();
                    case 'N': return new IfcAnnotationFillAreaOccurrence();
                    default: return null;
                }
            case 'R': return new IfcRelConnectsStructuralElement();
            case 'B': 
                switch (str.charAt(4)){
                    case 'U': return new IfcBuildingElementProxyTypeEnum();
                    case 'O': return new IfcBoundaryNodeConditionWarping();
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'T': return new IfcStructuralCurveMemberVarying();
                    case 'E': return new IfcSectionalAreaIntegralMeasure();
                    default: return null;
                }
            case 'C': return new IfcConstructionMaterialResource();
            case 'D': 
                switch (str.charAt(4)){
                    case 'R': return new IfcDraughtingPreDefinedTextFont();
                    case 'I': return new IfcDimensionCalloutRelationship();
                    default: return null;
                }
            case 'M': return new IfcMechanicalMaterialProperties();
            default: return null;
        }
    case 32:
        switch (str.charAt(3)){
            case 'R': return new IfcRelConnectsStructuralActivity();
            case 'S': 
                switch (str.charAt(13)){
                    case 'P': return new IfcStructuralPlanarActionVarying();
                    case 'L': return new IfcStructuralLinearActionVarying();
                    default: return null;
                }
            case 'C': return new IfcConstructionEquipmentResource();
            case 'D': 
                switch (str.charAt(4)){
                    case 'R': 
                        switch (str.charAt(13)){
                            case 'P': return new IfcDraughtingPreDefinedCurveFont();
                            case 'C': return new IfcDraughtingCalloutRelationship();
                            default: return null;
                        }
                    case 'I': return new IfcDimensionCurveDirectedCallout();
                    default: return null;
                }
            case 'E': 
                switch (str.charAt(4)){
                    case 'X': return new IfcExternallyDefinedSurfaceStyle();
                    case 'L': return new IfcElectricFlowStorageDeviceType();
                    default: return null;
                }
            case 'H': return new IfcHygroscopicMaterialProperties();
            default: return null;
        }
    case 33:
        switch (str.charAt(3)){
            case 'P': 
                switch (str.charAt(4)){
                    case 'R': 
                        switch (str.charAt(6)){
                            case 'P': 
                                switch (str.charAt(11)){
                                    case 'C': return new IfcPropertyConstraintRelationship();
                                    case 'D': return new IfcPropertyDependencyRelationship();
                                    default: return null;
                                }
                            case 'D': return new IfcProductsOfCombustionProperties();
                            default: return null;
                        }
                    case 'E': return new IfcPermeableCoveringOperationEnum();
                    default: return null;
                }
            case 'R': 
                switch (str.charAt(6)){
                    case 'A': return new IfcRelAssociatesProfileProperties();
                    case 'C': return new IfcRelContainedInSpatialStructure();
                    default: return null;
                }
            case 'S': 
                switch (str.charAt(4)){
                    case 'T': return new IfcStructuralSurfaceMemberVarying();
                    case 'E': return new IfcSectionReinforcementProperties();
                    default: return null;
                }
            case 'C': 
                switch (str.charAt(4)){
                    case 'L': return new IfcClassificationItemRelationship();
                    case 'O': return new IfcCoordinatedUniversalTimeOffset();
                    default: return null;
                }
            case 'D': return new IfcDistributionChamberElementType();
            case 'G': return new IfcGeometricRepresentationContext();
            default: return null;
        }
    case 34:
        switch (str.charAt(3)){
            case 'R': return new IfcRelReferencedInSpatialStructure();
            case 'T': 
                switch (str.charAt(4)){
                    case 'E': return new IfcTextStyleWithBoxCharacteristics();
                    case 'H': return new IfcThermodynamicTemperatureMeasure();
                    case 'I': return new IfcTimeSeriesReferenceRelationship();
                    default: return null;
                }
            case 'D': return new IfcDocumentInformationRelationship();
            case 'E': return new IfcEnvironmentalImpactCategoryEnum();
            case 'F': return new IfcFireSuppressionTerminalTypeEnum();
            default: return null;
        }
    case 35:
        switch (str.charAt(3)){
            case 'R': return new IfcRelConnectsWithRealizingElements();
            case 'S': 
                switch (str.charAt(13)){
                    case 'S': return new IfcStructuralSteelProfileProperties();
                    case 'L': 
                        switch (str.charAt(23)){
                            case 'D': return new IfcStructuralLoadSingleDisplacement();
                            case 'F': return new IfcStructuralLoadSingleForceWarping();
                            default: return null;
                        }
                    default: return null;
                }
            case 'F': return new IfcFillAreaStyleTileSymbolWithStyle();
            case 'M': 
                switch (str.charAt(4)){
                    case 'A': return new IfcMaterialDefinitionRepresentation();
                    case 'O': return new IfcModulusOfSubgradeReactionMeasure();
                    default: return null;
                }
            default: return null;
        }
    case 36:
        switch (str.charAt(3)){
            case 'R': return new IfcReinforcementDefinitionProperties();
            case 'C': 
                switch (str.charAt(4)){
                    case 'A': 
                        switch (str.charAt(34)){
                            case '2': return new IfcCartesianTransformationOperator2D();
                            case '3': return new IfcCartesianTransformationOperator3D();
                            default: return null;
                        }
                    case 'O': return new IfcConstraintAggregationRelationship();
                    default: return null;
                }
            case 'E': return new IfcElectricFlowStorageDeviceTypeEnum();
            case 'G': return new IfcGeometricRepresentationSubContext();
            case 'I': return new IfcIsothermalMoistureCapacityMeasure();
            case 'M': return new IfcMechanicalSteelMaterialProperties();
            default: return null;
        }
    case 37:
        switch (str.charAt(3)){
            case 'T': return new IfcThermalExpansionCoefficientMeasure();
            case 'D': return new IfcDistributionChamberElementTypeEnum();
            case 'M': return new IfcMaterialClassificationRelationship();
            default: return null;
        }
    case 39:
        switch (str.charAt(3)){
            case 'C': return new IfcConstraintClassificationRelationship();
            case 'L': return new IfcLuminousIntensityDistributionMeasure();
            case 'M': return new IfcMechanicalConcreteMaterialProperties();
            default: return null;
        }
    case 40:
        return new IfcElectricDistributionPointFunctionEnum();
    case 41:
        return new IfcModulusOfLinearSubgradeReactionMeasure();
    case 45:
        switch (str.charAt(3)){
            case 'S': return new IfcStructuralLoadSingleDisplacementDistortion();
            case 'M': return new IfcModulusOfRotationalSubgradeReactionMeasure();
            default: return null;
        }
    case 46:
        switch (str.charAt(34)){
            case '2': return new IfcCartesianTransformationOperator2DnonUniform();
            case '3': return new IfcCartesianTransformationOperator3DnonUniform();
            default: return null;
        }
    default: return null;
}
}
}