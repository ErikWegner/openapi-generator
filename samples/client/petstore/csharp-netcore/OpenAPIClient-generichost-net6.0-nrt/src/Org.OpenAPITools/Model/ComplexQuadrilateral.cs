// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ComplexQuadrilateral
    /// </summary>
    public partial class ComplexQuadrilateral : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComplexQuadrilateral" /> class.
        /// </summary>
        /// <param name="shapeInterface"></param>
        /// <param name="quadrilateralInterface"></param>
        [JsonConstructor]
        internal ComplexQuadrilateral(ShapeInterface shapeInterface, QuadrilateralInterface quadrilateralInterface)
        {
            ShapeInterface = shapeInterface;
            QuadrilateralInterface = quadrilateralInterface;
        }

        /// <summary>
        /// Gets or Sets ShapeInterface
        /// </summary>
        public ShapeInterface ShapeInterface { get; set; }

        /// <summary>
        /// Gets or Sets QuadrilateralInterface
        /// </summary>
        public QuadrilateralInterface QuadrilateralInterface { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public Dictionary<string, JsonElement> AdditionalProperties { get; } = new Dictionary<string, JsonElement>();

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ComplexQuadrilateral {\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// A Json converter for type ComplexQuadrilateral
    /// </summary>
    public class ComplexQuadrilateralJsonConverter : JsonConverter<ComplexQuadrilateral>
    {
        /// <summary>
        /// A Json reader.
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override ComplexQuadrilateral Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            Utf8JsonReader shapeInterfaceReader = utf8JsonReader;
            bool shapeInterfaceDeserialized = Client.ClientUtils.TryDeserialize<ShapeInterface>(ref utf8JsonReader, jsonSerializerOptions, out ShapeInterface? shapeInterface);

            Utf8JsonReader quadrilateralInterfaceReader = utf8JsonReader;
            bool quadrilateralInterfaceDeserialized = Client.ClientUtils.TryDeserialize<QuadrilateralInterface>(ref utf8JsonReader, jsonSerializerOptions, out QuadrilateralInterface? quadrilateralInterface);


            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string? propertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (propertyName)
                    {
                        default:
                            break;
                    }
                }
            }

            return new ComplexQuadrilateral(shapeInterface, quadrilateralInterface);
        }

        /// <summary>
        /// A Json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="complexQuadrilateral"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, ComplexQuadrilateral complexQuadrilateral, JsonSerializerOptions jsonSerializerOptions)
        {
            System.Text.Json.JsonSerializer.Serialize(writer, complexQuadrilateral.ShapeInterface, jsonSerializerOptions);

            System.Text.Json.JsonSerializer.Serialize(writer, complexQuadrilateral.QuadrilateralInterface, jsonSerializerOptions);

        }
    }
}
